package com.rishabh.algorithms.search;

public class Search {

    public int LinearSearch(int[] arr, int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public int BinarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(ledt <= right){
            int mid = left+(right-left) / 2;
            if(arr[mid] = =target){
                return mid;
            }
            if(arr[mid] < target){
                left++;
            }else{
                right++;
            }
        }
        return -1;
    }


}