package com.zhb.Class19;

/**
 * Created by zhb on 17-3-17.
 */

import java.util.TreeSet;

/**
 * 需求：
 * 将下列字符串转成：我要学编程
 *
 * 到底用四种功能中的哪一个呢？或者哪几个呢？
 * 思路方式：
 * 1,如果只想知道该字符串是否是错，使用匹配
 * 2,想要将已有的字符串变成另一个字符串，替换
 * 3,想要按照自己的方式将字符串编程多个字符串，切割，获取规则意外的字符串
 * 4,想要拿到符合需求的字符串子串，获取，获取符合规则的子串
 */
public class RegexTest {
    public static void main(String[] args) {
        test_1();
        String ip = "192.68.1.254 102.49.23.013 10.10.10.10 2.2.2.2 8.109.90.30";
        test_2(ip);
    }

    private static void test_1(){
        String str = "我我...我我...我要..要要...要要...学学学....学学...编编编...编程..程.程程...程...程";
        /*
        将已有字符串变成另一个字符串，使用替换功能。
        1,先将 . 去掉。
        2,在将多个重复的内容变成单个内容
         */
        str = str.replaceAll("\\.+","");
        str =str.replaceAll("(.)\\1+","$1");
        System.out.println(str);
    }

    /*
    192.68.1.254 102.49.23.013 10.10.10 2.2.2.2 8.109.90.30
    将ip地址进行地址段顺序的排列

    还按照zifuchaun自然顺序，只要让他们每一段都是3位即可。
    1,按照每一段需要的最多的0进行补齐，那么每一段就会至少保证有3位.
    2,将每一段只保留3位，这样，所有的ip地址都是每一段3位。
     */
    private static void test_2(String ip){
        ip = ip.replaceAll("(\\d+)","00$1");
        System.out.println(ip);
        ip = ip.replaceAll("0*(\\d{3})","$1");
        System.out.println(ip);
        String[] arr = ip.split(" ");
        TreeSet<String> ts = new TreeSet<String>();
        for (String s : arr){
            ts.add(s);
        }
        for (String s: ts){
            System.out.println(s.replaceAll("0*(\\d+)","$1"));
        }
    }
}
