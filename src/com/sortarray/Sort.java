package com.sortarray;

public class Sort {


    public int[] sort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int[] max = new int[1];
                    max [0] = arr[i];
                    arr[i] = arr[j];
                    arr[j] = max[0];
                }
            }

        }

        return arr;
    }

}
