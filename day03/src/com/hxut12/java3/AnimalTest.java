package com.hxut12.java3;

import java.sql.Connection;

/**
 * @author weijiangquan
 * @date 2022/4/18 -21:30
 *
 *
 * 多态性的使用举例一:
 *
 *
 */
public class AnimalTest{
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());

        test.func(new Cat());
    }

    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }

    // 如果没有多态的话，就会比较麻烦,要写下面的两个
    /*public void func(Dog dog){
        dog.eat();
        dog.shout();
    }
    public void func(Cat dog){
        dog.eat();
        dog.shout();
    }*/
}

class Animal{
    public void eat(){
        System.out.println("动物，进食");
    }

    public void shout(){
        System.out.println("动物：叫");
    }
}


class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void shout(){
        System.out.println("汪，汪，汪");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void shout(){
        System.out.println("喵喵");
    }
}


// 举例二
class Order{
    // 用下面的这个的话就只能调用Object有的方法了？(疑惑)
    public void method(Object obj){

    }
}

// 举例三
class Driver{
    public void doData(Connection conn){ //父类的结构  conn = new MySQLConnection()  /conn = new Aracle();
        //规范的步骤操作数据
        /*conn.method1();
        conn.method1();
        conn.method1();*/
    }
}











