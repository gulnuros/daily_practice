package Greedy;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int furthest = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i > furthest)
                return false;
            furthest = Math.max(furthest, i + nums[i]);
            if (furthest >= n - 1) {
                return true;
            }
        }
        return true;
    }
}
