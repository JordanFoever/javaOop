package com.hxut09.java;

/**
 * @author weijiangquan
 * @date 2022/4/17 -10:52
 *
 *
 *
 * 2.值传递机制
 *  如果参数是基本数据类型,此时实参赋给形参的是实参真实存储的数据值
 *  如果参数是引用数据类型,此时实参赋给形参的是实参存储数据的地址值
 *
 */
public class ValueTransferTest2{

    public static void main(String[] args) {
        Data data = new Data();

        data.m =10;
        data.n = 20;

        System.out.println("m="+data.m+"n="+data.n);

        // 交换m和n的值
        /*int temp = data.m;
        data.m = data.n;
        data.n =data.m;*/ //run result=>交换成功


        ValueTransferTest2 test2 = new ValueTransferTest2();
        test2.swap(data);  //传的是堆空间的同一个对象
        System.out.println("m="+data.m+"n="+data.n);  //run result=>交换成功
    }

    public void swap(Data data){  //传的是堆空间的同一个对象Data data = data; 对象传值传的是指针
        int temp = data.m;
        data.m = data.n;
        data.n =data.m;
    }
}

class Data{
    int m;
    int n;
}
