package Greedy;

public class JumpGameII {
    public int jump(int[] nums) {
        // [2,3,1,1,4]
        int n = nums.length;
        int minJumps = 0, currEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]); // 2, 4

            if (i == currEnd) { // 0, 1, 2
                minJumps++;
                currEnd = farthest; // 2, 4
            }
        }

        return minJumps;
    }
}
