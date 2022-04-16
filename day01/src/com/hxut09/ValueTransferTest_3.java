package com.hxut09;

/**
 * @author weijiangquan
 * @date 2022/4/17 -1:24
 *
 *
 * 关于变量的赋值
 *   如果变量是基本数据类型:此时赋值的是变量所保存的数据值
 *   引用的话,就是地址值了
 */
public class ValueTransferTest_3 {

    public static void main(String[] args) {
        System.out.println("========基本数据类型=======");
        int m = 10; //局部变量
        int n = m;
        System.out.println("m="+m+",n="+n);
        n = 20;
        System.out.println("m="+m+",n="+n);

        System.out.println("========引用数据类型=======");

        Order o1 = new Order();
        o1.orderId = 1001;
        Order o2 = o1; //赋值以后o1和o2的地址值相同,都指向了堆空间中的同一个对象实体
        System.out.println("o1.orderId="+o1.orderId+","+"o1.orderId="+o2.orderId);//run result=>o1.orderId=1001,o1.orderId=1001
        o2.orderId = 1002;
        System.out.println("o1.orderId="+o1.orderId+","+"o1.orderId="+o2.orderId);//run result=>o1.orderId=1002,o1.orderId=1002

    }
}

class Order{
    int orderId;
}
