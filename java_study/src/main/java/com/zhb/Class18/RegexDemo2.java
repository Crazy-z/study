package com.zhb.Class18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhb on 17-3-16.
 */
public class RegexDemo2 {
    /*
    正则表达式的第四个功能：
    4,获取：将字符床中的符合规则的字串取出。

    操作步骤：
    1,将正则表达式封装成对象
    2,让正则对象和要操作的字符串相关联
    3,关联后，获取正则匹配引擎
    4,通过引擎对符合规则的子串进行操作，比如取出
     */

    public static void main(String[] args) {

    }
    private static void getdemo(){
        String str = "";
        String reg = "\\b[a-z]{4}\\b";
        //将规则封装成对象
        Pattern p = Pattern.compile(reg);
        //
       Matcher m = p.matcher(str);
       while (m.find()){
           System.out.println(m.group());
       }

    }
}
