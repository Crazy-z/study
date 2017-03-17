package com.zhb.Class15;

/**
 * Created by zhb on 17-3-16.
 */
public class Student {
    private String name;
    private int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
