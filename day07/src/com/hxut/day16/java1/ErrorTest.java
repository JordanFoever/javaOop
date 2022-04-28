package com.hxut.day16.java1;

/**
 * @author weijiangquan
 * @date 2022/4/28 -17:51
 *
 *
 *
 * Error:java虚拟机都无法解决的严重问题.如:JVM系统内部错误,资源耗尽等严重情况
 *  StackOverflowError
 */
public class ErrorTest{
    public static void main(String[] args) {
        //1.栈溢出:Exception in thread "main" java.lang.StackOverflowError
        // main(args);

        //2.堆溢出:Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        Integer[] arr = new Integer[1024*1024*1024];
    }
}
