package com.zhb.Class06;

/**
 * Created by zhb on 17-3-16.
 */
public class MaoPaoTest {
    public static void main(String[] args) {
        int[] arr={6,8,9,5,1,4};
        int[] arr2={5,1,6,4,2,8,9};
        int[] arr3={6,5,4,3,2,1};

        maoPao(arr);
        System.out.println();
        bubbleSort(arr2);
        System.out.println();
        bubSort(arr3);
    }
    //冒泡排序,面试常见的排序
    private static void maoPao(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            //-i：让每次比较的元素减少
            //-1：避免角标越界
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //int temp= arr[j];
                    //arr[j] = arr[j+1];
                    //arr[j+1] = temp;
                    swap(arr,j,j+1);
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

    private static void bubbleSort(int[] arr2){
        for (int x=0;x<arr2.length-1;x++){
            for (int y=0;y<arr2.length-x-1;y++){
                if (arr2[y]>arr2[y+1]){
                    //int temp = arr2[y];
                    //arr2[y] = arr2[y+1];
                    //arr2[y+1] = temp;
                    swap(arr2,y,y+1);
                }
            }
        }
        print(arr2);
    }

    private static void bubSort(int[] arr3){
        for (int k=0;k<arr3.length-1;k++){
            for (int z=0;z<arr3.length-k-1;z++){
                if (arr3[z]>arr3[z+1]){
                    //int temp = arr3[z];
                    //arr3[z] = arr3[z+1];
                    //arr3[z+1] = temp;
                    //
                    swap(arr3,z,z+1);
                }
            }
        }
        print(arr3);
    }

    private static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
