package com.zhb.Class10;

/**
 * Created by zhb on 17-3-16.
 */
public class Test {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest("one");
        ThreadTest t2 = new ThreadTest("two");
        t1.start();
        t2.start();
        for (int x=0;x<60;x++){
            System.out.println("main..."+x);
        }


    }
}
