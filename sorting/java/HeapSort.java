/**
 * Heap sort is based on a binary heap ds
 * It's similar to selection sort where 
 * we first find the maximum element
 * and place the max el at the end.
 * We repeat the process for remaining elements
 *
 * Time complexity of heapsort is O(n lg n) for all cases
 */

public class HeapSort {
    /*
     * this is the max heap implementation
     */

    public void sort(int[] nums) {
        int n = nums.length;

        // Build heap (rearrange array)
        for (int i = n / 2; i >= 0; i--) heapify(nums, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            // call max heapify on the reduced heap
            heapify(nums, i, 0);
        }
    }

    public void heapify(int[] nums, int n, int i) {
        int largest = i;
        int left = 2*i + 1; // left node
        int right = 2*i + 2; // right node

        // if left is greater than root
        if (left < n && nums[left] > nums[largest]) largest = left;

        // if right is larger than the largest so far
        if (right < n && nums[right] > nums[largest]) largest = right;

        // if largest is not root
        if (largest != i) {
            int temp = nums[i];
            nums[i] = nums[largest];
            nums[largest] = temp;

            heapify(nums, n, largest);
        }
    }
}
