package com.hxut12.java2;

/**
 * @author weijiangquan
 * @date 2022/4/18 -19:29
 */
public class Person {


    String name;
    int age;
    int id = 420; //省份证号


    public Person(){
        System.out.println("我是Person(父类)");
    }
    public Person(String name){
        this.name = name;
    }

    public Person(String name,int age){
        this(name);
        this.age = age;
    }

    public void eat(){
        System.out.println("人,吃饭");
    }

    public void walk(){
        System.out.println("人;走路");
    }
}
