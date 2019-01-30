package com.xuyi.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5,7,9,4,5,10,55};
        System.out.print(Arrays.toString(bubbleSort(a)));
    }

    private static int[] bubbleSort(int[] a){
        for(int i=0;i<a.length-1;i++){
           for(int j=0;j<a.length-1-i;j++){
               if(a[j] > a[j+1]){
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
               }
           }
        }
        return a;
    }

}
