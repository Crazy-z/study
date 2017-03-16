package com.zhb.Class12;

import java.util.LinkedList;

/**
 * Created by zhb on 17-3-16.
 */
public class DuiLie {
    /*
    使用LinkedList模拟一个堆栈或者队列数据结构
    堆栈：先进后出，如同一个杯子
    队列：先进先出First in First out，如同水管
     */
    private LinkedList link;
    DuiLie(){
        link = new LinkedList();
    }
    public void myAdd(Object obj){
        link.addFirst(obj);
    }
    public Object myGet(){
        //return link.removeFirst();//先进后出
          return link.removeLast();//先进先出
    }
    public boolean isNUll(){
        return link.isEmpty();
    }
}
