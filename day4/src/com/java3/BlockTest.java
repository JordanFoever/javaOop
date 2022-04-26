package com.java3;

/**
 * @author weijiangquan
 * @date 2022/4/26 -21:38
 *
 * 类的成员之四:代码块(或初始化块)
 *  1.代码块的作用:用来初始化类,对象
 *  2.代码块如果有修饰的话,只能用static
 *  3.分类:静态代码块 vs 非静态代码块
 *
 *  静态代码块
 *      >内部可以有输出语句
 *      >随着类的加载而执行(不需要点)
 *      >作用:初始化类的信息
 *      >如果一个类中定义了多个静态代码块.则按照声明的先后顺序执行
 *      >静态代码块的执行要优先于非静态代码块的执行
 *      >静态的代码内只能调用静态的属性,静态的方法,不能调用非静态的结构
 *  ----------------------------------------------------------------------------------------------------
 *  非静态代码块
 *      >内部可以有输出语句
 *      >随着对象的创建而执行
 *      >每创建一个对象,就执行一次非静态代码块
 *      >作用:可以在创建对象的时候,对对象的属性等进行初始化
 *      >如果一个类中定义了多个非静态代码块.则按照声明的先后顺序执行
 *      >非静态的代码块内可以调用静态的属性,静态的方法,或非静态的属性,非静态的方法
 *
 *      在开发一般也就定义一个(通常情况下没有必要定义多个)
 *
 *
 *
 *  对属性可以赋值的位置
 *  ① 默认初始化
 *  ② 显式初始化
 *  ③ 有了对象以后,可以通过"对象.属性"u或对象.方法的方式进行赋值
 *  ④ 在代码块中中赋值
 *
 *  执行先后顺序: ① - ②/⑤-③-④
 *
 *
 *
 *
 *
 *
 *
 */
public class BlockTest {
    public static void main(String[] args) {
        // 当使用一个类的时候类就会被加载(属性和方法和会随着类的加载而加载)
        String desc = Person.desc; //run result=>hello,static
        Person person = new Person(); //run result=>hello block
        System.out.println(desc);
    }
}

class Person{
    String name;
    int age;
    static String desc = "我是一个人";

    public Person(){

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    // 代码块(静态代码块)
    static {
        System.out.println("hello,static block");
        desc = "我是一个爱学习的人";
    }
    static {
        System.out.println("hello,static block1");
    }
    {
        System.out.println("hello block");
        age = 1;
    }
    {
        System.out.println("hello block1");
        age = 1;
    }
    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    // toString默认的话只会给非静态的方法(属于对象的)
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void info(){
        System.out.println("我是一个快乐的人");
    }
}

