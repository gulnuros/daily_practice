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
}
