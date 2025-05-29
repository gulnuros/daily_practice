public class MissingNumber {
    public int missingNumber(int[] nums) {
        int supposeSum = 0;
        for (int i = 0; i < nums.length + 1; i++) {
            supposeSum += i;
        }

        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
        }

        int missingNum = supposeSum - currentSum;
        return missingNum;
    }

    // solution using Gauss' Formula
    // public int missingNumber(int[] nums) {
    // int supposeSum = (nums.length * (nums.length + 1)) / 2;

    // int currentSum = 0;
    // for (int num : nums) {
    // currentSum += num;
    // }

    // int missingNum = supposeSum - currentSum;
    // return missingNum;
    // }

    // Bit Manipulation solution
    // public int missingNumber(int[] nums) {
    // int missingNum = nums.length;
    // for (int i = 0; i < nums.length; i++) {
    // missingNum ^= i ^ nums[i];
    // }
    // return missingNum;
    // }
}
