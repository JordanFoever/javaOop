package com.hxut13.exer3;

/**
 * @author weijiangquan
 * @date 2022/4/25 -19:54
 *
 * 笔试题目(看起来简单  实际上有点难度)
 *
 * 想一下add是不是重写
 */
public class InterviewTest1 {

    public static void main(String[] args) {
        Base1 base1 = new Sub1();
        base1.add(1,2,3);


         Sub1 s = (Sub1)base1; //强转
         s.add(1,23,3);
    }
}

class Base1{
    public void add(int a,int... arr){//是重写
        System.out.println("base1");
    }
}
class Sub1 extends Base1{
    public void add(int a,int[] arr){ //这个算重写
        System.out.println("sub_1");
    }
    public void add(int a,int b,int c){
        System.out.println("sub_2");
    }
}

