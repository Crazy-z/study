package com.zhb.class03;

/**
 * Created by zhb on 17-3-16.
 */
public class MainTest {

    public static void main(String[] args) {
       // jiuJiu();
        juXing(5,6);
    }
    private static void jiuJiu(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }

    private static void juXing(int a,int b){
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
