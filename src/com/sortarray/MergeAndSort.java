package com.sortarray;

import java.util.Arrays;

public class MergeAndSort {

    private int[] mergedArray;

    public int[] getMergedArray() {
        return mergedArray;
    }

    public void setMergedArray(int[] mergedArray) {
        this.mergedArray = mergedArray;
    }
    public int[] mergeAndSort(int[] arr1, int[] arr2, int[] arr3){
        mergedArray = new int[arr1.length+arr2.length+arr3.length];

        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i]= arr1[i];
        }
        for (int i = arr1.length; i< arr1.length+arr2.length; i++){
            mergedArray[i]= arr2[i-arr1.length];
        }
        for (int i = arr1.length+arr2.length; i< arr1.length+arr2.length+arr3.length; i++){
            mergedArray[i]= arr3[i-arr1.length-arr2.length];
        }

        System.out.println(Arrays.toString(mergedArray));

        for (int i = 0; i < mergedArray.length; i++) {
            for (int j = i+1; j < mergedArray.length; j++) {
                if(mergedArray[i]>mergedArray[j]){
                    int[] max = new int[1];
                    max [0] = mergedArray[i];
                    mergedArray[i] = mergedArray[j];
                    mergedArray[j] = max[0];
                }
            }

        }

        return mergedArray;
    }

}
