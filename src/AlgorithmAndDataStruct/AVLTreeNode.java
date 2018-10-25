package AlgorithmAndDataStruct;

/**
 * Created by Administrator on 2018/9/24.
 */
public class AVLTreeNode {
    public int data, depth;
    public AVLTreeNode parent;
    public AVLTreeNode Lchild;
    public AVLTreeNode Rchild;

    public AVLTreeNode(int data) {
        this.data = data;
        parent = null;
        Lchild = null;
        Rchild = null;
        depth = 1;
    }
}
