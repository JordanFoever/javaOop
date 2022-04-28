package com.hxut.java;

/**
 * @author weijiangquan
 * @date 2022/4/28 -13:34
 *
 * 笔试题(开发中不会出现这样的问题,谁没有事会定义同名的变量)
 *
 *
 */
interface A {
    int x = 0;
}
class B{
    int x =1;
}
public class C extends B implements A{

    public void pX(){
        // System.out.println(x);  //错误的写法
        System.out.println(super.x); //调用的父类的x(调用的是B)
        System.out.println(A.x);  //x是全局常量,直接通过接口.就可以了(调用的是A中的)
    }

    public static void main(String[] args) {
        new C().pX();
    }
}
