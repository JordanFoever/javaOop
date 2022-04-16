package com.hxut08.java;

/**类和对象的使用(面向对象的实现)
 *
 * 如果修改一个对象不不影响另外一个对象的属性值
 * @author weijiangquan
 * @date 2022/4/16 -15:31
 */
public class PersonTest{
    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();
        p1.name = "Tom";
        p1.age  = 22;
        System.out.println(p1.name);
        p1.eat();
        p1.sleep();
        Person p2 = new Person();
        System.out.println(p2.name); //null
        //将p1变量保存的对象地址赋值给p3,导致p3和p1指向了堆空间的同一个对象实体
        Person p3 = p1;
        // 修改p3就相当与修改了p1

        p3.age = 10;
        System.out.println(p3.age); //run result=>10
        System.out.println(p1.age); //run result=>10

    }
}

