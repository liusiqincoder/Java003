package leetcode800to1000;

import java.util.List;
import java.util.Stack;

/**
 * Created by Administrator on 2018/10/1.
 */
public class Solution675 {
    private static int min = Integer.MAX_VALUE;

    public static int cutOffTree(List<List<Integer>> forest) {
        int all = 0;
        for (List l : forest) {
            for (int i = 0; i < l.size(); i++)
                if ((int) l.get(i) > 1)
                    all++;
        }

        return dfs(forest, 0, 0, all);
    }

    private static int dfs(List<List<Integer>> forest, int x, int y, int num) {
        Stack<Integer> dx = new Stack<>(), dy = new Stack<>(), val = new Stack<>();
        if (x - 1 >= 0 && (dx.empty() || forest.get(x - 1).get(y) <= val.peek())) {
            if (!dx.empty()) {

            }
        }
        return 0;
    }
}
