package com.xuyi.sort;

import java.util.Arrays;

/**
 * 简单排序
 */
public class SimpleSort {
    public static void main(String[] args) {
        int[] a = {5,7,9,4,5,10,55};
        System.out.print(Arrays.toString(simpleSort(a)));
    }
    private static int[] simpleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    //交换两个数
                    min = j;
                }
            }
            if(i != min){
                //交换
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
