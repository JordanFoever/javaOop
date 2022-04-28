package com.hxut.java3;

/**
 * @author weijiangquan
 * @date 2022/4/28 -15:42
 *
 * 类的内部成员之五:内部类
 * 1.java中允许将一个类A声明在另一个类B中,则类A就是内部类,类B就是外部内
 *
 * 2.内部类的分类:成员内部类(静态,非静态) vs 局部内部类(方法内,代码块内,构造器内)
 *
 * 3.成员内部类:
 *    一方面,作为外部类的成员
 *          >调用外部的结构
 *          > 可以被static修饰(注意外部类不能被static修饰)
 *          > 可以被四中不同的权限修饰
 *
 *    另方方面,作为一个类:
 *        > 类内可以定义属性方法,构造器等
 *        > 可以被final修饰,表示此类不能被继承,反之救可以被继承
 *        > 可以被abstract修饰(不能被实例化了)
 *
 * 4.关注如下3个问题
 *  4.1 如何实用化成员内部类的对象
 *  4.2 如何在成员内部类中区分调用外部类的结构
 *  4.3 开发中局部内部类的使用(见InnerClassTest1.java)
 */
public class InnerClassTest {
    public static void main(String[] args) {

        //创建Dog实例(静态的成员内部类):
        Person.Dog  dog = new Person.Dog();
        dog.show();

        // 创建Bird实例(非静态的成员内部类)
        // Person.Bird  bird  = new Person.Bird(); //错误的写法
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();
        System.out.println("********************");
        bird.display("我是形参的");
    }
}


class Person{

    String name = "我是Person的成员变量";
    int age;
    public void eat(){
        System.out.println("人吃饭");
    }
    // 静态成员内部类
    static class Dog{
        String name;
        int age;

        public void show(){
            System.out.println("我是一条狗");
        }
    }

    //非静态成员内部类
    class Bird{
        String name = "我是内部类的成员变量";

        public Bird(){

        }

        public void sing(){
            System.out.println("唱歌");
            eat(); //简写
            // Person.this.eat(); //调用外部类的非静态属性
        }
        public void display(String name){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);
        }
    }
    public void method(){
        //局部内部类
        class AA{

        }
    }
    {
        //局部内部类
        class BB{

        }
    }

    public Person(){
        //局部内部类
        class CC{

        }
    }

}
