package com.hxut10.java;

/**
 * @author weijiangquan
 * @date 2022/4/17 -14:49
 */
public class Order_3 {

    private int orderPrivate;
    int orderDefault;
    public int orderPublic;


    private void methodPrivate(){
        orderDefault = 1;
        orderPrivate = 2;
        orderPublic = 3;
    }

    void methodDefault(){
        orderDefault = 1;
        orderPrivate = 2;
        orderPublic = 3;
    }

    public void methodPublic(){
        orderDefault = 1;
        orderPrivate = 2;
        orderPublic = 3;
    }
}
