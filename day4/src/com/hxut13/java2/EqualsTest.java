package com.hxut13.java2;

import java.util.Date;

/**
 * @author weijiangquan
 * @date 2022/4/25 -20:35
 *
 * 这节课很重要(干货慢慢)
 *
 * 面试题: ==和equals的区别
 *
 * 回顾 == 的使用
 * ==:运算符
 * 1.可以使用在基本数据类型和引用数据类型变量中
 * 2.如果比较的是基本的类型变量:比较的两个变量保存的胡数据是否相等 (不一定类型要相同)
 *   如果比较的是引用雷类型:比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体
 *
 *
 *
 * 二.equals()方法的使用
 * 1.是一个方法，而非运算符
 * 2.适用与引用数据类型
 * 3.Object中equals()的定义
 *   public boolean equals(Object obj) {
 *         return (this == obj);
 *     }
 *     说明:Object类中定义的equals()和==的作用是相同的
 * 4.像 String,date,File,包装类等都重写了Object类中的equals方法 重写以后，比较的不是两个引用的地址是否相同
 *  而是比较两个对象的"实体内容"是否相同
 *
 * 5.通常情况下，我们自定义的类如果适用equals()的话，也通常是比较两个对象的"实体类内容"是否相同，那么，我们就需要对Object
 *  类中的equals()进行重写，
 *    // 重写的原则:比较两个对象的实体内容(在本类中即:name和age)是否相同
 *
 *
 *
 *
 */
public class EqualsTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i==j);  //run result=>true
        System.out.println(i==d); //run result=>true  会有基本数据类型的提升


        boolean b = true;
        // System.out.println(i==b); //run result=>报错 都和布尔类型的完

        char c = 10;  //这里没有单引号就是10
        System.out.println(i==c); //run result=>true

        char c1= 'A';
        char c2 = 65;
        System.out.println(c1==c2);//run result=>true


        // 比较引用类型的 Customer是自己定义的是同一类
        Customer customer = new Customer("aaa",12);
        Customer customer1 = new Customer("aaa",12);
        System.out.println(c1==c2); //run result=>false

        String str1 = new String("aaa");
        String str2 = new String("aaa");
        System.out.println(str1==str2);//run result=>false


        System.out.println("自定义的对象"+customer.equals(customer1)); //对于equals实际上用到了多态  Object obj
                                      //run result=>false
        System.out.println(str1.equals(str2)); //run result=>true
                              //这里的的equals被重写了和上面的不一样

        Date date1 = new Date(1214314242L);
        Date date2 = new  Date(1214314242L);
        System.out.println(date1.equals(date2)); //run result=>true
        System.out.println(date1==date2); //run result=>false

       /* Object a = "aa";
        String bb = "aa";
        System.out.println(bb.equals(a));*/ //run result=>true 自己瞎写的


        String wei1 = "dasd";
        String wei2 = wei1;
        System.out.println(wei1.equals(wei2)); //run result=>true


    }

}
