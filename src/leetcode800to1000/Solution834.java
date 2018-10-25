package leetcode800to1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2018/9/23.
 */
public class Solution834 {

    private static int[] nodesum = null;//nodeSum[i]:=儿子节点个数
    private static int[] f = null, pre = null;   //到达其他结点的总路程
    private static ArrayList<Integer>[] tree = null;//邻接表实现树
    private static boolean[] isRoot = null;

    public static int[] sumOfDistancesInTree(int N, int[][] edges) {
        int root = -1;
        nodesum = new int[N];
        f = new int[N];
        isRoot = new boolean[N];
        tree = new ArrayList[N];
        pre = new int[N];
        for (int i = 0; i < N; i++)
            tree[i] = new ArrayList<>();

        Arrays.fill(nodesum, 0);
        Arrays.fill(isRoot, true);

        for (int i = 0; i < edges.length; i++) {
            tree[edges[i][0]].add(edges[i][1]);
            pre[edges[i][1]] = edges[i][0];
            nodesum[edges[i][0]]++;
            isRoot[edges[i][1]] = false;
        }


        for (int i = 0; i < N; i++)
            if (isRoot[i]) {
                root = i;
                break;
            }

        help(-1, root, root);

        f[root] = deepth(root, 0);
        Queue<Integer> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            int node = que.poll();
            for (int i = 0; i < tree[node].size(); i++)
                que.add(tree[node].get(i));
            f[node] = f[pre[node]] - nodesum[node] + N - 2;
        }
//        help1(N,tree);
        return f;
    }

    private static int help(int pre, int pos, int root) {
        if (tree[pos].size() == 0)
            return 1;
        int res = 0;
        for (int i = 0; i < tree[pos].size(); i++) {
            res += help(pos, tree[pos].get(i), root);
        }
        if (root == pos)
            return res;
        return nodesum[pre] = res + 1;
    }

    private static int deepth(int root, int dep) {
        int res = 0;
        for (int i = 0; i < tree[root].size(); i++) {
            res += deepth(tree[root].get(i), dep + 1) + dep + 1;
        }
        return res;
    }
/*

    private static void help1(int n, ArrayList<Integer>[] tree) {
        Queue<Integer> que=new LinkedList<>();

    }
*/

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}};
        int[] res = sumOfDistancesInTree(6, edges);
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i] + "  " + nodesum[i]);
    }
}
