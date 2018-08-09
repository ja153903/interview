/**
 * Divide input array into two halves, calls itself for 
 * the two halves and then merges the two sorted halves.
 * The merge(arr, low, mid, high) is a key process that
 * assumes that arr[low...mid] and arr[mid+1...high] are sorted
 * and merges the two sorted sub-arrays into one.
 *
 * theta(n lg n) is complexity in all 3 cases.
 *
 * Merge sort is better to be used when dealing with external memory
 * because it minimizes expensive reads of the external hard drive
 */

public class MergeSort {
    public void merge(int[] nums, int low, int mid, int high) {
        int m = mid - low + 1;
        int n = high - mid;

        int[] left = new int[m];
        int[] right = new int[n];

        for (int i = 0; i < m; i++) left[i] = nums[low + i];
        for (int i = 0; i < n; i++) right[i] = nums[mid + 1 + i];

        int i = 0, j = 0, k = low;

        while (i < m && j < n) {
            if (left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            nums[k] = left[i];
            i++; k++;
        }

        while (j < n) {
            nums[k] = right[j];
            j++; k++;
        }
    }

    public void sort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(nums, low, mid);
            sort(nums, mid+1, high);
            merge(nums, low, mid, high);
        }
    }
}
