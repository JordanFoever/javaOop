package com.hxut13.java2;

import java.util.Date;

/**
 * @author weijiangquan
 * @date 2022/4/26 -0:55
 *
 * Object类中toString方法的使用，只要没有重写，调用的都是Object对象中的toString
 * 1.当我们输出一个对象的引用时，实际上就是调用当前对象的toString()方法
 *
 * 2.Object类中的toString()的定义
 *   public String toString() {
 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *     }
 *     getClass().getName()得到当前对象的类名   Integer.toHexString(hashCode())通过hashCode之后转换成了十六进制的字符串
 *
 * 3.像String,Date,File,包装类都重写了Object类中的toString()方法
 *      使用调用对象的toString()方法时，返回的"实体内容信息"
 *
 * 4.自定义类也可以重写toString()方法，当调用此方法时，返回对象的实体内容
 *
 *
 */
public class ToStringTest {
    public static void main(String[] args) {


        Customer cust1 = new Customer("tom",22);
        System.out.println(cust1); //run result=>com.hxut13.java2.Customer@1b6d3586 -->重写toString之后Customer[name=tom,age=22]
                        // 底层会调用toString方法 返回给我们一个hasCode的16进制的地址值
        System.out.println(cust1.toString()); //run result=>com.hxut13.java2.Customer@1b6d3586 -->重写toString之后Customer[name=tom,age=22]


        String str = new String("MM");

        System.out.println(str); //run result=>MM
        Date date = new Date(8126738426L);//run result=>MM
        System.out.println(date.toString());//run result=>Sun Apr 05 09:25:38 CST 1970

    }
}

