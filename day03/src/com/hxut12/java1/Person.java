package com.hxut12.java1;

/**
 * @author weijiangquan
 * @date 2022/4/18 -17:41
 */
public class Person{

    String name;
    int age;

    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("父类Person吃饭");

    }

    public void walk(int distance){
        System.out.println("走路走的距离是");
        show();  //由于show是private类型的 调用子类不能重写的方法
        eat();   //子类可以重写的方法
    }

    private void show(){
        System.out.println("我是父类中的show方法");
    }

    public Object info(){
        return null;
    }
    public double aa(){
        return 1.2;
    }

}
