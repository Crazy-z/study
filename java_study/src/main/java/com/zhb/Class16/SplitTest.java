package com.zhb.Class16;

/**
 * Created by zhb on 17-3-16.
 */
public class SplitTest {
    public static void main(String[] args) {
    //splitDemo("zhangsan,tom,andy,lisi");
        //splitDemo2("c:\\abc\\a.txt");//用两对\\去切割\\
        demo("adcceflldkiisdf");
    }
    private static void splitDemo(String str){
        //定义规则按照，号分割
        //要用.进行切割需要用转意字符\\.
        String  reg = ",";
        //split分割
        String[] arr= str.split(reg);
        for (String s : arr){
            System.out.println(s);
        }
    }
    private static void splitDemo2(String s){
        String r = "\\\\";
        String[] arr=s.split(r);
        for (String ss:arr){
            System.out.println(ss);
        }
    }
    //按照叠词去切割
    //(.)把.封装成列组，从1开始，使用：(.)\1,字符串用"(.)\\1"
    //为了让规则的结果被重用可以加盖规则封装一个组，用()来完成，祖德出现都有编号，
    //从1开始
    private static void demo(String string){
        String regex = "(.)\\1";
        String[] array = string.split(regex);
        for (String st : array){
            System.out.println(st);
        }
    }

}
