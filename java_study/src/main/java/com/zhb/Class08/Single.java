package com.zhb.Class08;

/**
 * Created by zhb on 17-3-16.
 */
public class Single {
    //
    private static Single s = new Single();
    //私有化构造函数
    private  Single(){}
    public static Single getInstance(){
        return s;
    }
}
