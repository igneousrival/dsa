# Quick Sort Algorithm

## Overview
Quick Sort is a sorting algorithm based on the divide-and-conquer paradigm. It selects a pivot, partitions the array around the pivot, and then recursively sorts the partitions.

## Algorithm Logic
1. **Choose a Pivot**: The last element in the array is chosen as the pivot.
2. **Partition the Array**: Elements smaller than or equal to the pivot move to the left, and greater elements move to the right.
3. **Recursively Sort**: Quick Sort is applied recursively to both left and right partitions.
4. **Base Condition**: If the subarray has one or zero elements, recursion stops as it is already sorted.

## Step-by-Step Execution

### Step 1: Initial Call to QuickSort
- The function `sort(arr)` is called.
- It calls `quickSort(arr, 0, arr.length - 1)`.

### Step 2: Partitioning the Array
- A pivot (last element) is chosen.
- Elements are rearranged so that:
    - Elements ≤ pivot are on the left.
    - Elements > pivot are on the right.
- The pivot is placed in its correct sorted position.

### Step 3: Recursive Sorting
- The left subarray (`low` to `pivotIndex - 1`) is sorted recursively.
- The right subarray (`pivotIndex + 1` to `high`) is sorted recursively.

### Step 4: Base Case Handling
- When `low >= high`, recursion stops as the array is sorted.

## Example Execution
Consider sorting `[4, 2, 7, 1, 9, 3]`.

1. Choose `3` as the pivot.
2. Rearrange: `[2, 1, 3, 4, 9, 7]`, pivot `3` is correctly placed.
3. Recursively sort `[2, 1]` and `[4, 9, 7]`.
4. Continue partitioning until the entire array is sorted.

## Complexity Analysis
- **Best/Average Case**: O(n log n) (Balanced partitions)
- **Worst Case**: O(n²) (Highly unbalanced partitions, e.g., sorted array with bad pivot selection)
- **Space Complexity**: O(log n) due to recursion

## Key Points
- Uses in-place sorting (requires no extra memory apart from recursion stack).
- Not a stable sort.
- Efficient for large datasets.

# Merge Sort Algorithm

## Overview
Merge Sort is a divide-and-conquer sorting algorithm that recursively divides the array into smaller subarrays, sorts them, and then merges them back together.

## Algorithm Logic
1. **Divide**: Split the array into two halves until each subarray contains only one element.
2. **Conquer**: Recursively sort the subarrays.
3. **Merge**: Combine the sorted subarrays back into a single sorted array.

## Merge Logic
1. Create two temporary arrays: one for the left half and one for the right half.
2. Copy elements from the original array into these temporary arrays.
3. Use two pointers to compare elements from both arrays:
  - If the element in the left array is smaller, copy it back to the original array.
  - If the element in the right array is smaller, copy it back to the original array.
4. Copy any remaining elements from both temporary arrays back to the original array.
5. The merged array is now sorted.

## Step-by-Step Execution

### Step 1: Initial Call to Merge Sort
- The function `sort(arr)` is called.
- It invokes `mergeSort(arr, 0, arr.length - 1)`.

### Step 2: Recursively Divide the Array
- Find the middle index: `middle = (left + right) / 2`.
- Recursively call `mergeSort(arr, left, middle)` to sort the left half.
- Recursively call `mergeSort(arr, middle + 1, right)` to sort the right half.

### Step 3: Merge the Sorted Arrays
- Create temporary arrays for the left and right halves.
- Copy elements from the original array into these temporary arrays.
- Compare elements from both halves and copy the smaller element back to the original array.
- Copy any remaining elements from the temporary arrays back to the original array.

### Step 4: Base Case Handling
- If `left >= right`, recursion stops as the subarray contains only one element.

## Example Execution
Consider sorting `[4, 2, 7, 1, 9, 3]`.

1. Split into `[4, 2, 7]` and `[1, 9, 3]`.
2. Further split into `[4] [2,7]` and `[1] [9,3]`.
3. Merge `[2,7]` into `[2,7]`, `[9,3]` into `[3,9]`.
4. Merge `[4]` and `[2,7]` into `[2,4,7]`.
5. Merge `[1]` and `[3,9]` into `[1,3,9]`.
6. Merge `[2,4,7]` and `[1,3,9]` into `[1,2,3,4,7,9]`.

## Complexity Analysis
- **Best/Average/Worst Case**: O(n log n) (Balanced divisions always ensure logarithmic depth)
- **Space Complexity**: O(n) (Extra space required for merging)

## Key Points
- Stable sorting algorithm (preserves order of equal elements).
- Requires additional memory for temporary arrays.
- Efficient for large datasets and linked lists.





