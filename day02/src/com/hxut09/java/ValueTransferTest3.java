package com.hxut09.java;

/**
 * @author weijiangquan
 * @date 2022/4/17 -11:39
 */
public class ValueTransferTest3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a,b);  //需要在method方法被调用后,仅打印处a=100,b=200,写出method方法
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void method(int a,int b){
        System.out.println("a="+a*10);
        System.out.println("b="+b*10);
        System.exit(0); //退出程序
    }
}
