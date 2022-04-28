package com.hxut.day15;

/**
 * @author weijiangquan
 * @date 2022/4/27 -21:42
 *
 *
 * 接口的使用
 *  1.使用interface来定义
 *  2.java中,接口和类是两个并列的结构
 *  3.如何定义接口,定义接口中的成员
 *
 *      3.1 JDK7及以前,只能定义常量和抽象方法
 *          > 全局常量 public static final的,初学的时候可以省略不写
 *                     如:public static final int MAX_SPEEd = 7900
 *                         可以写成 int MAX_SPEEd = 7900(默认会帮你加上前缀)
 *          > 抽象方法 public abstract 的
 *
 *      3.2 JDK 8 :除了定义全局常量和抽象方法之外,还可以定义静态方法,默认方法(略)
 *
 * 4.接口不能定义构造器!意味着接口不能实例化
 *
 * 5.在Java开发中,接口都通过类去实现(implements)的方式来使用
 *      如果实现类覆盖了接口中的所有的抽象方法,则此实现类就可以实例化
 *      如果实现类没有覆盖接口中所有的抽象方法,则此实现类仍是抽象类
 * 6 Java类可以实现多个接口 ---> 弥补了java单继承的局限性
 *
 *  格式:class AA extends BB implements CC,DD,EE
 *
 * 7.接口和接口之间可以继承并且可以多继承
 *
 *
 * 8.接口的具体使用,体现多态性
 * 9.接口实际上是一种规范
 *
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);
        System.out.println(Flyable.MAX_SPEEd);


        Plane plane = new Plane();
        plane.fly();
    }
}

interface Flyable{

    //全局常量
    public static final int MAX_SPEEd = 7900; //第一宇宙速度
    int MIN_SPEED = 1;  //省略了 public static final


    //抽象方法
    public abstract void fly();

     void stop(); //省略了 public abstract

    //错误信息: Interface abstract methods cannot have body
    // 接口中不能定义构造器
    /*public Flyable(){

    }*/
}


class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("飞机通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }

}

// 没有实现全部的抽象方法就要变程抽象类
abstract class Kite implements Flyable{

    @Override
    public void fly() {

    }

}


