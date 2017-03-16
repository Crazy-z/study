package com.zhb.Class05;

/**
 * Created by zhb on 17-3-16.
 */
public class ArrySort {
    public static void main(String[] args) {
        int[] arr={5,3,8,6,4,9};
        sort(arr);
        sort2(arr);

    }
    //选择排序
    private static void sort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        print(arr);
    }

    private static void print(int[] arr){
        for (int a:arr){
            System.out.print(a+" ");
        }
    }

    private static void sort2(int[] arr){
        for (int x=0;x<arr.length-1;x++){
            for (int y=x+1;y<arr.length;y++){
                if (arr[x]>arr[y]){
                    int tem = arr[x];
                    arr[x]=arr[y];
                    arr[y]=tem;
                }
            }
        }
        print(arr);
    }
}
