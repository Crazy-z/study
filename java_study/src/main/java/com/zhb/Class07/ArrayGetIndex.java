package com.zhb.Class07;

/**
 * Created by zhb on 17-3-16.
 */
public class ArrayGetIndex {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
       int index= getIndex(arr,9);
        System.out.println(index);
        int halfIndex = halfSearch(arr,7);
        System.out.println(halfIndex);
    }
    //数组的查找
    private static int getIndex(int[] arr,int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    //二分法查找/折半查找
    private static int halfSearch(int[] arr,int b){
        int min = 0;
        int max = arr.length-1;
        int mid = (min+max)/2;
        while(arr[mid] != b){
            if(b>arr[mid]){
                min=mid+1;
            } else if(b<arr[mid]){
                max = mid-1;
            } else{
                mid=(min+max)/2;
            }

        }
        return mid;
    }
}
