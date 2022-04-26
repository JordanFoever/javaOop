package com.hxut14.java2;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author weijiangquan
 * @date 2022/4/26 -20:51
 *
 * 单例模式的懒汉式实现
 */
public class SingletonTest2 {


}
class Order{
    //1.私有化类的构造器
    private Order(){

    }
    //2.声明当前的对象,没有初始化
    //4.此对象也必须声明为static
    private static Order instance = null;

    //3.声明public static的返回当前类对象的方法
    public static  Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }
}


