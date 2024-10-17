package io.github.jiangdequan;

import java.util.*;

public class Sort {

    public  List<Integer> BubbleSort(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        for (int num : arr) {
            res.add(num);
        }
        return res;
    }

    
}