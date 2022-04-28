package com.hxut.java;

/**
 * @author weijiangquan
 * @date 2022/4/27 -17:54
 *
 * Abstract关键字的使用
 *
 * 1.Abstract可以用来修饰的结构:类,方法
 *
 * 2.abstract修饰类:抽象类
 *       > 此类不能实例化
 *       > 抽象类中一定有构造器,便于子类实例化的时候调用(涉及,子类实例化的全过程)
 *       > 开发中都会提供抽象类的子类,让子类对象实例化,完成相关的操作
 * 3.abstract修饰的方法:抽象方法
 *          > 抽象方法只有方法的声明,没有方法体
 *          > 包含抽象方法的类一定是抽象类,反之,抽象类中可以没有抽象方法
 *               (tips:抽象方法由于没有方法体,如果它不在抽象类中的话,就可以实例化它所在的类,这个时候就可以通过对象调用它,显然相互矛盾)
 *          > 若子类重写了父类中的所有的抽象方法后,此类方可实例化
 *               若子类没有重写父类中的所有抽象方法,则子类也是一个抽象类,需要使用abstract修饰
 *          >
 *
 *
 */
public class AbstractTest {
    public static void main(String[] args) {
        // 一旦Person抽象了,就不可实例化
        /*Person p1 =new Person();
        p1.eat();*/
    }

}


abstract class Creature{
    public abstract void breath();
}

abstract class Person extends Creature{
    String name;
    int age;


    public Person(){

    }

    //抽象方法
    public abstract void eat();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void walk(){
        System.out.println("人走路");
    }
}


class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("学生多吃有营养的东西");
    }

    public void breath(){
        System.out.println("通过嘴巴呼吸");
    }
}
