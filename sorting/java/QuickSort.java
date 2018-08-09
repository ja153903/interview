/**
 * Quicksort is a divide and conquer algorithm
 * It picks an element as a pivot and partitions 
 * the given array around the picked pivot.
 *
 * The key process in quicksort is partition()
 * Target of partition is, given an array and an element x
 * of array as pivot, put x at its correct position in sorted
 * array and put all the smaller els before x and put all 
 * greater elements after x
 *
 * Note that in the worst case quicksort runs in theta(n^2) complexity
 * In the best case, runs theta(n lg n) complexity.
 *
 * In the average case, it runs O(n lg n) complexity
 *
 * Although it has a worst time complexity than algorithms such as
 * merge sort and heap sort, quicksort is faster in practice, 
 * because its inner loop can be efficiently implemented on 
 * most architectures. So the worst case rarely happens.
 *
 * However, merge sort is generally considered better when
 * the data is huge and stored in external storage.
 *
 * Quick sort in its general form is an in-place sort.
 * This means that it doesn't require extra storage whereas
 * merge sort would require O(n) extra storage where n
 * is the array size which may be quite expensive.
 * Allocating and deallocating the extra space costs time.
 *
 * Randomized quicksort is implemented most practically because
 * making the algorithm probabilistic gives us more control
 * over the running time.
 *
 * Randomized quicksort is where we pick a different pivot 
 * every time. 
 *
 * Note that if we were to implement a recursive version
 * of quicksort, we would want it to be tail recursive
 * to avoid a stack overflow
 */

public class QuickSort {
    /*
     * This function takes the last element as the pivot
     * it places the pivot element at its correct
     * position in sorted array, and places
     * all smaller (smaller than pivot) to left of
     * pivot and all greater elements to right of pivot
     */

    public int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }

    public void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            // get the pivot index
            int pivotIndex = partition(nums, low, high);

            // Recursively sort the elements before
            // partition and after partition
            quickSort(nums, low, pivotIndex-1);
            quickSort(nums, pivotIndex+1, high);
        }
    }
}
