package com.hxut12.java2;

/**
 * @author weijiangquan
 * @date 2022/4/18 -18:39
 *
 *
 * 体会4种不同的权限修饰符
 *
 */
public class Order {

    private int orderPrivate;

    int orderDefault;

    protected int orderProtected;

    public int orderPublic;

    private void methodPrivate(){
        orderPrivate = 11;
        orderDefault=2;
        orderProtected=3;
        orderPublic = 4;
    }
    void methodDefault(){

    }
    protected void orderProtected(){

    }
    public void orderPublic(){

    }
}


