package com.hxut09;

/**
 * @author weijiangquan
 * @date 2022/4/17 -0:25
 *
 *
 * 重载
 * 1. 允许一个以上的同名方法
 *   两同一不同  同一个类 相同的方法名
 *               参数列表不同:参数个数不同,参数类型不同
 *
 *  2.判断是否重载:
 *      和方法的权限修饰符,返回值类型,形参变量名,方法体都没有关系
 *  3.在通过对象调用方法时,如何确定指定的方法:
 *       方法名--->参数列表
 */


public class OverLoadTest_2 {
    public static void main(String[] args) {
        OverLoadTest_2 test_2 = new OverLoadTest_2();
        test_2.getSum(1,2);
        test_2.getSum("hh",22);
    }

    public void getSum(int i,int j){
        System.out.println(i+j);
    }
    public void getSum(double i,double j){
        System.out.println(i-j);
    }

    public void getSum(String s,int i){
        System.out.println(s+i);
    }
    // 下面的这个不行
    /*public int getSum(int i,int j){

    }*/
    
}
