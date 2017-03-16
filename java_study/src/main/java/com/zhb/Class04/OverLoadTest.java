package com.zhb.Class04;

/**
 * Created by zhb on 17-3-16.
 */
public class OverLoadTest {
    public static void main(String[] args) {
        int sum = sum(5, 6);
        int sum1 = sum(2, 3, 4);
        System.out.println(sum+"-->"+sum1);
    }
    private static int sum(int x, int y){
        return x+y;
    }
    private static int sum(int x, int y,int z){
        return x+y+z;
    }
    /*
    void show (int a,char b,double c){}
    a.
    void show(int x,char y,double z){}//没有重载，因为和元函数一样
    b.
    int show(int a,double c,char b){}//重载，因为参数列表类型不相同，注意：重载和返回值类型没有关系
    c.
    void show(int a,double c,char b){}//重载，参数列表不同，与返回值没有关系
    d.
    boolean show(int c,char b){}//重载，参数列表个数不同，与返回值类型无关
    e.
    void show(double c){}//重载，参数个数不同
    f.
    double show(int x,char y,double z){}//没有重载，参数列表类型一致
     */

}
