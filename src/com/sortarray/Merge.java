package com.sortarray;

import java.util.Arrays;

public class Merge {

    private int[] mergedArray;

    public int[] getMergedArray() {
        return mergedArray;
    }

    public void setMergedArray(int[] mergedArray) {
        this.mergedArray = mergedArray;
    }

    public int[] merge(int[] arr1, int[] arr2, int[] arr3){

        mergedArray = new int[arr1.length+arr2.length+arr3.length];

        int j=0; int k=0; int l=0;
        for (int i=0; i<mergedArray.length; i++ ){

            if(j<arr1.length){
                mergedArray[i]=arr1[j];
                j++;
            }
            else if (k<arr2.length){
                mergedArray[i]=arr2[k];
                k++;
            }
            else{
                mergedArray[i]=arr3[l];
                l++;
            }

        }

        return mergedArray;
    }

}

