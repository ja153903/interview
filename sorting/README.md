# Sorting

## Quicksort
Worst case: theta(n^2)
Average case: O(n lg n)
Best case: theta(n lg n)

## MergeSort
Worst/Average/Best case: O(n lg n)

## HeapSort

## QuickSort vs. MergeSort
It's better to use quicksort for most situations where you're dealing with cached memory.
However, when you are dealing with memory going in and out of external hard drives, then
it's better to use merge sort.

## When to use insertion or radix sort
Radix sort is only useful when you have fixed-length integer keys
The algorithm sorts data with integer keys by grouping keys by the individual digits
which share the same significant position and value

For example:
Original, unsorted list:
    170, 45, 75, 90, 02, 802, 2, 66
Then we sort by the 1's place:
    170, 90, 2, 802, 2, 45, 75, 66
Then we sort by the 10's place:
    02, 802, 02, 45, 66, 170, 75, 90
Sorting by 100's place:
    002, 002, 045, 066, 075, 090, 170, 802

Insertion sort is better than quicksort for smaller lists because of the recursive overhead.
Insertion sort is also more stable than quicksort and requires less memory (no recursive calls in insertion sort)
