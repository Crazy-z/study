package com.zhb.Class14;

/**
 * Created by zhb on 17-3-16.
 */
public class Person {
    private String name;
    private int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public  String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)){
            return false;
        }
        Person p = (Person) obj;
        return this.name.equals(p.name) && this.age == p.age;
    }
}
