package com.zhb.Class19;


import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.*;


/**
 * Created by zhb on 17-3-16.
 */
public class class19 {
    public static void main(String[] args) {
        try {
            getMails();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 目标：拿到新浪首页上右侧的新闻标题以及对应的链接，存到hashmap中
     * @throws Exception
     */
    public static void getMails() throws Exception{
        URL url=new URL("http://www.sina.com.cn");
       URLConnection urlConnection=url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
        BufferedReader bufIn=new BufferedReader(inputStreamReader);
        String line=null;
        String content="";
        while((line=bufIn.readLine())!=null){
            content+=line;
        }
//        String reg="<a .*?>.*?</a>";
//        List<String> list = regex(reg, content);
//        for(String str:list){
//            System.out.println(str);
//        }
        //1.先定位ul标签，从content中拿到所要的li所在的ul部分
        String reg="<ul class=\"list-a\" style=\"display: block;\" data-sudaclick=\"blk_top2A_news\">.*?</ul>";
        List<String> list = regex(reg, content);
        String ul=list.get(0);
        String liReg="<li>.*?</li>";
        List<String> liList = regex(liReg, ul);
        String hrefReg="<a .*? href=\"(.*?)\">";
        String textReg="\">(.*?)</a>";
        Map<String,String> resultMap=new HashMap<String, String>();
        for(String li:liList){
            String href="";
            String text="";
            Pattern p = Pattern.compile(hrefReg);
            Matcher matcher = p.matcher(li);
            while (matcher.find()){
                href=matcher.group(1);
                break;
            }
            Pattern p2 = Pattern.compile(textReg);
            Matcher matcher2 = p2.matcher(li);
            while (matcher2.find()){
                text=matcher2.group(1);
                break;
            }
            if(href!=""&&text!=""){
                resultMap.put(text,href);
            }
        }
        for(String key:resultMap.keySet()){
            System.out.println(key+"\t"+resultMap.get(key));
        }


    }
    private static List<String> regex(String regex, String content){
        List<String> results=new ArrayList<String>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            results.add(matcher.group());
        }
        return results;
    }

}
