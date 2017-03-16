package com.zhb.Class09;

/**
 * Created by zhb on 17-3-16.
 */
public class Rec implements Shape {
    private int len,wid;
    public Rec(int len,int wid) throws NoValueException {
            if (len<=0 || wid<=0){
                throw new NoValueException("出现非法值");
            }
                this.len = len;
                this.wid = wid;

    }
    public void getArea() {
        System.out.println(len*wid);
    }
}
