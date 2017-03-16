package com.zhb.Class10;

/**
 * Created by zhb on 17-3-16.
 */
public class ThreadTest extends Thread {
    private String name;
    ThreadTest(String name){
        this.name = name;
    }
    public void run() {
        for (int x=0;x<60;x++){
            System.out.println(name+"test run..."+x);
        }
    }
}
