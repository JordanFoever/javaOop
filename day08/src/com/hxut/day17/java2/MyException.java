package com.hxut.day17.java2;

/**
 * @author weijiangquan
 * @date 2022/4/29 -16:30
 *
 * 1.如何自定义异常:RuntimeException,Exception
 * 2.提供全局常量serialVersionUID
 * 3.T提供重载的构造器
 */
public class MyException extends Exception{
    static final long serialVersionUID = -7034827190745766939L; //抄源码的
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

}

