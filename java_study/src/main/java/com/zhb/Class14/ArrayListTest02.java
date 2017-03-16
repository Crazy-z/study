package com.zhb.Class14;

/**
 * Created by zhb on 17-3-16.
 */
import java.util.*;
public class ArrayListTest02 {
    /*
    将自定义对象作为元素存储到ArryayList集合中，并去除重复元素。
    比如：存人对象，同姓名，同年龄，视为同一个人
     */
    public static void main(String[] args) {
        List ls = new ArrayList();
        ls.add(new Person("zhangsan01",30));
        ls.add(new Person("zhangsan02",32));
        ls.add(new Person("zhangsan01",30));
        ls.add(new Person("zhangsan04",35));
        ls.add(new Person("zhangsan02",32));
        ls = singleElement(ls);
        sop(ls);

        Iterator it = ls.iterator();
        while(it.hasNext()){
            Person p = (Person)it.next();
            sop(p.getName()+" "+p.getAge());
        }

    }
    private static List singleElement(List ls){
        //定义一个临时的集合容器
        List list = new ArrayList();
        Iterator it = ls.iterator();
        while(it.hasNext()){
            Object obj = it.next();

            if (!list.contains(obj)){
                list.add(obj);
            }
        }
        return list;
    }
    private static void sop(Object obj){

        System.out.println(obj);
    }
}
