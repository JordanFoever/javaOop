package com.hxut13;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author weijiangquan
 * @date 2022/4/25 -22:13
 *
 * equals的练习题
 *
 *
 */
public class exer4 {
    public static void main(String[] args) {
        Order order1 =new Order(12,"aa");
        Order order2 =new Order(12,"aa");
        System.out.println(order1.equals(order2)); //run result=>true


        String s1 = "BB";
        String s2 = "BB";  //放在了常量池中
        System.out.println(s1==s2); //run result=>true  比较特殊的情况
    }
}



class Order{
    int orderId;
    String orderName;


    public Order(int orderId,String orderName){
        this.orderId = orderId;
        this.orderName = orderName;
    }
    public void setOrderId(int orderId){
        this.orderId = orderId;
    }
    public int getOrderId(){
        return orderId;
    }

    public void setOrderName(String orderName){
        this.orderName = orderName;
    }
    public String getOrderName(){
        return orderName;
    }


    // 重写Object的equals方法 我们自己写的这个不是很完善(有一点的漏洞)
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Order){
            Order order = (Order)obj;  //不点的话 就不能调用Order类中的属性

            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        }
        return false;
    }
}



























