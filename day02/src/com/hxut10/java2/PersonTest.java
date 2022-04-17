package com.hxut10.java2;

/**
 * @author weijiangquan
 * @date 2022/4/17 -20:02
 *
 * this关键字的使用
 *  1.this可以用来修饰:属性,方法,构造器
 *  2.this修饰属性和方法
 *      this理解为当前对象或当前正在创建的对象
 *    2.1 在类的方法中  我们可以使用"this.属性或this.方法"的方式调用当前对象属性或方法.但是,通常
 *         情况下,我们都选择省略"this.变量"的方式,表明此变量是属性而不是形参
 *    2.2 在类的构造器中  我们可以使用"this.属性或this.方法"的方式调用当前对象属性或方法.但是,通常
 *         情况下, 我们都选择省略"this.变量"的方式,表明此变量是属性而不是形参'
 *
 *  3.this调用构造器
 *    ① 在类的构造器中,可以显式的使用"this(形参列表)"方式,调用本类中指定的其它构造器
 *    ② 构造器中不能使用"this(形参列表)"调用自己
 *    ③ 如果一个类中有n个构造器,就最多有n-1构造器中使用了"this(形参列表)"
 *    ④ 规定""this(形参列表)""必须声明在当前构造器的首行
 *    ⑤ 构造器的内部,最多只能声明一个"this(形参列表)",用来调用其它的构造器(细节问题)
 *
 *
 *
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(121);
        System.out.println(person.getAge());
    }
}


class Person{

    private String name;
    private int age;


    public Person(){
        this.eat();
    }
    public Person(String name){
        this(); //调用无参
        this.name = name;
    }


    private void eat() {
        System.out.println("吃饭");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;  //this是当前的对象
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}


