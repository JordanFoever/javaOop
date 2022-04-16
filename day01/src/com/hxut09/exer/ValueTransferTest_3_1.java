package com.hxut09.exer;

/**
 * @author weijiangquan
 * @date 2022/4/17 -1:36
 *
 * 方法形参的传递机制 :值传递
 *   1. 形参:方法定义时,声明的小括号的参数
 *      实参:实际传递的时候的数据
 *   2.值传递的机制
 *
 *
 *
 */
public class ValueTransferTest_3_1 {
    public static void main(String[] args) {

        // 交换变量
        int m = 10;
        int n = 20;

       ValueTransferTest_3_1 test_3_1 = new ValueTransferTest_3_1();
        test_3_1.swap(m,n);
        
        System.out.println("m="+m+",n="+n);

    }

    /**
     * 交换两个变量的值操作
     * @param m
     * @param n
     */
    public void swap(int m,int n){
        int temp  = m;
        m = n;
        n = temp;

    }
}
