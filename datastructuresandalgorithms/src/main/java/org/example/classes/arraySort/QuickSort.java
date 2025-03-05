package org.example.classes.arraySort;

public  class QuickSort {

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr,low,high);

            // Recursively sort elements before and after the pivot
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is <= pivot
            if (arr[j] <= pivot) {
                swap(arr, ++i, j);
            }
        }
        // Place pivot in the correct position
        swap(arr, ++i, high);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}