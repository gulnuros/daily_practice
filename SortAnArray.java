import java.util.Random;

public class SortAnArray {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        Random rnd = new Random();
        int rndInd = rnd.nextInt(left, right + 1);
        swap(arr, left, rndInd);

        int pivot = arr[left];
        int storeInd = left + 1;
        for (int i = left + 1; i <= right; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, storeInd);
                storeInd++;
            }
        }
        swap(arr, left, storeInd - 1);
        int l = storeInd - 2;
        while (l >= left && arr[l] == pivot)
            l--;
        quickSort(arr, left, l);
        int r = storeInd;
        while (r <= right && arr[r] == pivot)
            r++;
        quickSort(arr, r, right);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
