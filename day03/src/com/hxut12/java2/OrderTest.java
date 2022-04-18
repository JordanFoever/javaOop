package com.hxut12.java2;

/**
 * @author weijiangquan
 * @date 2022/4/18 -19:17
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;
        order.orderProtected = 2;
        order.orderPublic = 3;


        order.methodDefault();
        order.orderProtected();
        order.orderPublic();

        // 下面两个都报错 同一个包种不能调用私有的属性和方法
        /*order.orderPrivate = 4;
        order.methodPrivate();*/

    }
}


