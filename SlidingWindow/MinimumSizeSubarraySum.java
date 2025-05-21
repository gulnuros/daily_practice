package SlidingWindow;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int j = 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                res = Math.min(res, i - j + 1);
                sum -= nums[j];
                j++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
