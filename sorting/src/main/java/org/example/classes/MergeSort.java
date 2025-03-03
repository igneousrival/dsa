package org.example.classes;

public class MergeSort {

    public void sort(int[] arr){
        mergeSort(arr,0,arr.length-1);
    }

    public void mergeSort(int [] arr, int left, int right){
        if(left < right){
            int middle = (left + right ) / 2;
            mergeSort(arr,left,middle);
            mergeSort(arr,middle+1,right);

            merge(arr,left,right,middle);
        }
    }

    public void merge(int[] arr, int left, int right, int middle){
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        System.arraycopy(arr, left, leftArray, 0, leftSize);
        for(int i = 0; i < rightSize; i++){
            rightArray[i] = arr[middle + 1 + i];
        }

        int i = 0, j = 0, k = 1;

        while(i < leftSize && j < rightSize){
            if(leftArray[i] <= rightArray[j]){
                arr[k++] = leftArray[i++];
            }
            else {
                arr[k++] = rightArray[j++];
            }
        }

        while(i < leftSize){
            arr[k++] = leftArray[i++];
        }
        while(j < rightSize){
            arr[k++] = rightArray[j++];
        }

    }


}
