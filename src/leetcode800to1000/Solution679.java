package leetcode800to1000;

/**
 * Created by Administrator on 2018/10/3.
 */
public class Solution679 {

    private boolean[] visit = {false, false, false, false};

    public boolean judgePoint24(int[] nums) {

        return false;
    }

    public boolean dfs(int[] nums, int num) {
        if (num < Math.E - 2)
            return true;
        for (int i = 0; i < nums.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                for (int j = i + 1; j < nums.length; j++) {
                    if (!visit[j]) {
                        visit[j] = true;
                        if (dfs(nums, num - (nums[i] + nums[j])))
                            return true;
                        if (dfs(nums, num - (nums[i] + nums[j])))
                            return true;
                        visit[j] = false;
                    }
                }
                visit[i] = false;
            }
        }
        return false;
    }
}
