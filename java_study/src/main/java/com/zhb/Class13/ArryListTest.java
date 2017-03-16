package com.zhb.Class13;

/**
 * Created by zhb on 17-3-16.
 */
/*
去除ArryList中的重复元素
 */
import java.util.*;
public class ArryListTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java01");
        al.add("java02");
        al.add("java01");
        al.add("java02");
        al.add("java01");
        al.add("java03");
        sop(al);
        al = singleElement(al);
        sop(al);

    }
    private static ArrayList singleElement(ArrayList a1){
        //定义一个临时容器
        ArrayList newA1 = new ArrayList();
        Iterator it = a1.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(!newA1.contains(obj)){
                newA1.add(obj);
            }
        }
        return newA1;
    }

    private static void sop(Object obj){
        System.out.println(obj);
    }
}
