package com.sort;

public class MergeSort {
    public static void sort(int[] arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        sort(arr, leftIndex, rightIndex);
    }

    private static void sort(int[] arr, int leftIndex, int rightIndex) {
        if(leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            sort(arr, leftIndex, middleIndex);
            sort(arr, middleIndex + 1, rightIndex);
            merge(arr, leftIndex, middleIndex, rightIndex);
        }
    }

    private static void merge(int[] arr, int leftIndex, int middleIndex, int rightIndex) {
        int leftArraySize = middleIndex - leftIndex + 1;
        int rightArraySize = rightIndex - middleIndex;

        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        for(int i = 0; i < leftArraySize; i++) {
            leftArray[i] = arr[leftIndex + i];
        }

        for(int i = 0; i < rightArraySize; i++) {
            rightArray[i] = arr[middleIndex + 1 + i];
        }

        int i = 0, j = 0, k = leftIndex;

        while(i < leftArraySize && j < rightArraySize) {
            if(leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while(i < leftArraySize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < rightArraySize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
