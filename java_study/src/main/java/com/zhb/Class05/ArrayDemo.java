package com.zhb.Class05;

/**
 * Created by zhb on 17-3-16.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        array(arr);
        array2(arr);
        int max=max(arr);
        System.out.println("最大值："+max);
        int min=min(arr);
        System.out.println("最小值："+min);
    }
    //数组的遍历
    private static void array(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    //数组遍历的第二种方式
    private static void array2(int [] arr){
        for(int a:arr){
            System.out.println(a);
        }
    }

    //1,获取数组中的最大值，以及最小值
    private static int max(int [] arr){
        int max=arr[0];
        for (int a=0;a<arr.length;a++){
            if(arr[a]>max){
                max=arr[a];
            }

        }
        return max;
    }
    private static int min(int[] arr){
        int min=arr[0];
        for (int a:arr){
            if (a<min){
                min=a;
            }
        }
        return min;
    }
}
