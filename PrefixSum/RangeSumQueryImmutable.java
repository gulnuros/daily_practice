package PrefixSum;

public class RangeSumQueryImmutable {
    class NumArray {
        int[] array;

        public NumArray(int[] nums) {
            array = new int[nums.length + 1];
            array[0] = 0;
            for (int i = 1; i <= nums.length; i++) {
                array[i] = array[i - 1] + nums[i - 1];
            }
        }

        public int sumRange(int left, int right) {
            return array[right + 1] - array[left];
        }
    }
}
