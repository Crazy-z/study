package com.zhb.Class16;

/**
 * Created by zhb on 17-3-16.
 */
public class RegexDemo {
    /*
    正则表达式：符合一定规则的表达式。
    作用：用于专门操作字符串。
    特点：用一些特定的符号来表示一些代码的操作，这样就简化书写。
    所以学习正则表达式，就是在学习一些特殊符号的使用。
    具体操作功能：
    1,匹配：String matches()方法。用改回则怕匹配整个字符串。
     */


    public static void main(String[] args) {
        //checkqq("46651");
        //demo("ab11361");
        checkTel("13052784611");
    }
    private static void checkqq(String qq){
        //以字符1-9开头，必须是数字字符0-9,长度5-15位
        String regex = "[1-9][0-9]{4,14}";

        boolean boo =qq.matches(regex);
        if(boo){
            System.out.println("qq合法"+qq);
        } else{
            System.out.println("用户不合法");
        }
    }
    private static void demo(String str){
        //[abc]用于判断是否是以abc其中的字符开头，字符只能是一个字符。返回值boolean
        //?表示出现0次或
        //String reg = "[abc][a-z]\\d?";//[a-z]判断小写字母
         // *表示出现0次或者多次
        String reg = "[abc][a-z]\\d?";//[a-z]判断小写字母
        //matches（）方法是用来匹配字符用的。
        boolean boo = str.matches(reg);
        System.out.println(boo);
    }
    //匹配手机号段是否正确
    private static void checkTel(String tel){
         String re = "[1][358]\\d{9}";
         boolean b = tel.matches(re);
        System.out.println(b);


    }
}
