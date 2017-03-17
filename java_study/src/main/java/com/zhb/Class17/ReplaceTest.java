package com.zhb.Class17;

/**
 * Created by zhb on 17-3-16.
 */
public class ReplaceTest {
    public static void main(String[] args) {
        //将字符串中的5个以上数字换成#
        String str = "sdfa45454dfdfad5566357dddeeaadd";
        replaceDemo(str,"\\d{5,}","#");
        String s="asdfffflidmnnnmindkkkkk";
        demo(s,"(.)\\1+","@");
        //获取组符号的值用$1
        demo2("zzzzzldddddinnnnn","(.)\\1+","$1");
    }
    private static void replaceDemo(String str,String reg,String newStr){
        str = str.replaceAll(reg,newStr);
        System.out.println(str);
    }
    //将叠词替换成#号
    private  static  void demo(String s,String re,String newS){
        s = s.replaceAll(re,newS);
        System.out.println(s);
    }
    //将重叠的字母替换成单个字母
    //获取组符号的值用$1
    private static void demo2(String c,String r,String n){
        c= c.replaceAll(r,n);
        System.out.println(c);
    }
}
