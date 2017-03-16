package com.zhb.Class09;

/**
 * Created by zhb on 17-3-16.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        Rec rec = null;
        try {
            rec = new Rec(3,4);
            rec.getArea();
        } catch (NoValueException e) {
            e.printStackTrace();
        }



    }

}
