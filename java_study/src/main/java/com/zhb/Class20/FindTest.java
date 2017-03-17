package com.zhb.Class20;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhb on 17-3-17.
 */
public class FindTest {
    public static void main(String[] args) {
        getHtml();
    }
    //获取新浪首页
    private static void getHtml(){
        BufferedReader bufIn=null;
        //String str="http://www.sina.com.cn";
        String str = "http://www.hao123.com/";
        try {
             bufIn= getBfr(bufIn,str);

            String line = null;
            String reg = "<a href=\".*?\">";
            Pattern pattern = Pattern.compile(reg);
            while ((line=bufIn.readLine())!=null){
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    System.out.println(matcher.group());
                }
            }



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static  BufferedReader getBfr(BufferedReader bufIn,
                                           String str) throws IOException {

      URL  url = new URL(str);
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream);
        bufIn = new BufferedReader(isr);
            return bufIn;
    }

}
