package com.hxut08.exer;

/**
 * 有点收获,可以自己画一下堆和栈的内存图(待做)
 *
 * @author weijiangquan
 * @date 2022/4/16 -20:28
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "小王";
        p1.age = 21;
        p1.sex = 1;

        p1.study();
        p1.showAge();
        int newAge = p1.addAge(2);
        System.out.println("新的年龄是"+newAge); //run result=>23
        System.out.println(p1.age); //run result=>23

        Person p2 = new Person();
        p2.showAge(); //run result=>0

    }
}
