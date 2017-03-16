package com.zhb.Class10;

/**
 * Created by zhb on 17-3-16.
 */
public class Ticket extends Thread{
    private static int ticket = 100;
    public void run(){
        while(true){
            if (ticket>0){
                System.out.println(currentThread().getName()+"sale: "+ ticket--);
            }

        }
    }
}
