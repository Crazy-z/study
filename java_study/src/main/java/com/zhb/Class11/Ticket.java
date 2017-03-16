package com.zhb.Class11;

/**
 * Created by zhb on 17-3-16.
 */
public class Ticket implements Runnable {
    private int ticket =100;
    public void run(){
        while(true){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"sale..."+ticket--);
            }
        }


    }

}
