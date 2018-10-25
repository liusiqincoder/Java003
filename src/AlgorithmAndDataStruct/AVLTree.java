package AlgorithmAndDataStruct;

/**
 * Created by Administrator on 2018/9/23.
 */
public class AVLTree {

    AVLTreeNode root;

    public AVLTree(AVLTreeNode root) {
        this.root = root;
    }

    public void modify(AVLTreeNode root, AVLTreeNode node) {
        int balance = 0;
        while (node != null) {
            update_depth(node);
            balance = is_balance(node);
            if (-1 > balance || balance > 1) {
                if (balance < -1) {
                    if (is_balance(node.Rchild) > 0)
                        node = RR_rotate(node);
                    else
                        node = RL_rotate(node);
                } else {
                    if (is_balance(node.Lchild) > 0)
                        node = LL_rotate(node);
                    else
                        node = LR_rotate(node);
                }
                if (node.parent == null) {
                    root = node;
                    break;
                }
            }
            node = node.parent;
        }
    }

    private int is_balance(AVLTreeNode node) {
        if (node == null)
            return 0;
        return get_balance(node.Lchild) - get_balance(node.Rchild);
    }

    public void insert(int data) {
        AVLTreeNode node = new AVLTreeNode(data);
        AVLTreeNode tmp = insert_val(root, node, null);
        if (tmp != null) {
            update_depth(tmp);
            modify(root, tmp);
        }
    }

    private AVLTreeNode findMin(AVLTreeNode node) {
        AVLTreeNode tmp = node;
        while (tmp.Lchild != null) {
            tmp = tmp.Lchild;
        }
        return tmp;
    }

    public AVLTreeNode remove(AVLTreeNode root, AVLTreeNode tmp, int data) {
        if (root == null) {
            tmp = null;
            return null;
        }
        if (data < root.data) {
            return remove(root.Lchild, tmp, data);
        } else if (data > root.data) {
            return remove(root.Rchild, tmp, data);
        } else
            tmp = root;

        if (tmp != null) {
            if (root.parent == null) {
                AVLTreeNode temp = null;
                temp = remove_node(tmp);
                modify(root, tmp);
            }
            return tmp;
        }
        return null;
    }

    public AVLTreeNode remove_node(AVLTreeNode node) {
        AVLTreeNode parent = node.parent, tmp = null;
        if (node.Lchild == null && node.Rchild != null) {
            tmp = node.Rchild;
            node.Rchild = null;
            tmp.parent = node.parent;
            node.parent = null;
        } else if (node.Lchild != null && node.Rchild == null) {
            tmp = node.Lchild;
            node.Lchild = null;
            tmp.parent = node.parent;
            node.parent = null;
        } else if (node.Lchild == null && node.Rchild == null) {
            if (parent == null) {
                root = null;
            } else {
                node.parent = null;
                if (parent.Lchild == node)
                    parent.Lchild = null;
                else
                    parent.Rchild = null;
                update_depth(parent);
            }
        } else {
            AVLTreeNode min = findMin(node.Rchild);
            node.data = min.data;
            parent = min.parent;
            if (parent.Lchild == min) {
                parent.Lchild = null;
            } else {
                parent.Rchild = null;
            }
            min.parent = null;
            update_depth(parent);
        }
        return parent;
    }

    private AVLTreeNode insert_val(AVLTreeNode root, AVLTreeNode node, AVLTreeNode parent) {
        /*

         */
        if (root == null) {
            root = node;
            node.parent = parent;
            return node;
        }
        if (node.data < root.data)
            return insert_val(root.Lchild, node, root);
        else if (node.data > root.data)
            return insert_val(root.Rchild, node, root);
        else
            return null;
    }

    AVLTreeNode LR_rotate(AVLTreeNode node) {
        RR_rotate(node.Lchild);
        return LL_rotate(node);
    }

    private AVLTreeNode RR_rotate(AVLTreeNode node) {
        AVLTreeNode parent = node.parent, son = node.Rchild;
        node.Rchild = son.Lchild;
        if (son.Lchild != null)
            son.Lchild.parent = node;
        update_depth(node);
        node.parent = son;
        son.Lchild = node;
        son.parent = parent;
        if (parent != null) {
            if (parent.Lchild == node) {
                parent.Lchild = son;
            } else {
                parent.Rchild = son;
            }
        }
        update_depth(son);
        return son;
    }

    private AVLTreeNode LL_rotate(AVLTreeNode node) {
        AVLTreeNode parent = node.parent, son = node.Lchild;
        node.Lchild = son.Rchild;
        if (son.Rchild != null)
            son.Rchild.parent = node;
        update_depth(node);
        node.parent = son;
        son.Rchild = node;
        update_depth(son);
        if (parent != null) {
            if (parent.Lchild == node) {
                parent.Lchild = son;
            } else {
                parent.Rchild = son;
            }
        }
        return son;
    }

    private AVLTreeNode RL_rotate(AVLTreeNode node) {
        LL_rotate(node.Rchild);
        return RR_rotate(node);
    }

    private void update_depth(AVLTreeNode node) {
        if (node == null) {
            return;
        } else {
            int left = get_balance(node.Lchild);
            int right = get_balance(node.Rchild);
            node.depth = Math.max(left, right) + 1;
        }
    }

    private int get_balance(AVLTreeNode node) {
        if (node == null)
            return 0;
        return node.depth;
    }

    public AVLTreeNode getRoot() {
        return root;
    }

    public void setRoot(AVLTreeNode root) {
        this.root = root;
    }
}
