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

