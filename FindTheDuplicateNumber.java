import java.util.HashMap;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {

        int n = nums.length;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                res = nums[i];
            }
            map.put(nums[i], i);

        }
        return res;
    }
}
