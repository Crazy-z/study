package com.zhb.Class20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhb on 17-3-17.
 */
public class FindBaidu {
    public static void main(String[] args) {
        getBaidu();
    }
    //获取百度首页的搜有A标签
    private static void getBaidu(){
    String str = "http://www.baidu.com";
    BufferedReader bufIn = null;
        try {
            bufIn = getBufIn(bufIn,str);
            String line = null;
            //定义正则规则
            String regx = "<a href=(.*?)\\w>";
            Pattern p = Pattern.compile(regx);
            while ((line=bufIn.readLine())!=null){
                Matcher matcher = p.matcher(line);
                while (matcher.find()){
                    System.out.println(matcher.group());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static BufferedReader getBufIn(BufferedReader bufIn,String str) throws IOException {
        URL url = new URL(str);
        URLConnection urlConn = url.openConnection();
        InputStream inputStream = urlConn.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream);
        bufIn = new BufferedReader(isr);
        return bufIn;
    }
}
