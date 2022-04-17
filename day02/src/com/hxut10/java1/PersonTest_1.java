package com.hxut10.java1;

import sun.awt.PeerEvent;

/**
 * @author weijiangquan
 * @date 2022/4/17 -15:13
 *
 * 一,构造器的作用
 *  1 创建对象
 *  2 初始化对象的属性(信息)
 *  3 一个类中定义多个构造器,彼此构成重载
 *  4 一旦显式的定义了构造器之后,系统就不再提供默认的空参构造器
 *  5 一个类中至少有一个构造器
 * 二,说明
 *   1.如果显式的定义类的构造器的话,则系统默认提供一个空参的构造器
 *   2.定义构造器的格式:权限修饰符 类名(形参列表{})
 *
 *
 */
public class PersonTest_1 {
    public static void main(String[] args) {
        //创建类的对象 new + 构造器


        // Person p = new Person();
        // p.eat();


        Person p1 = new Person("Tom");
        System.out.println(p1.name);

    }
}

class Person{
    String name;
    int age;

    // 构造器
    /*public Person(){
        System.out.println("Person()");
    }*/

    public Person(String n){
        name = n;
    }

    public Person(String n,int a){
        name = n;
        age = a;
    }

    public void eat(){
        System.out.println("吃饭");
    }


}
