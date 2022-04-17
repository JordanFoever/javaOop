package com.hxut10.java;

/**
 * @author weijiangquan
 * @date 2022/4/17 -14:48
 */
public class OrderTestfer_2{
    public static void main(String[] args) {
        Order_3 order_3 = new Order_3();
        // 出了那个类之后,私有的属性不可以调用
        // order_3.orderPrivate = 32; 报错
        order_3.orderDefault = 3;
        order_3.orderPublic = 45;

        order_3.methodDefault();
        order_3.methodPublic();


    }
}

