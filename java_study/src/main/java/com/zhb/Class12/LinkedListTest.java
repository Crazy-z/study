package com.zhb.Class12;

/**
 * Created by zhb on 17-3-16.
 */
import java.util.*;
public class LinkedListTest {
    public static void main(String[] args) {
        DuiLie dl = new DuiLie();
        dl.myAdd("java01");
        dl.myAdd("java02");
        dl.myAdd("java03");
        dl.myAdd("java04");
        while(!dl.isNUll()){
            System.out.println(dl.myGet());
        }
    }


}
