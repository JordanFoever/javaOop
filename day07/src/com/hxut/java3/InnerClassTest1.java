package com.hxut.java3;

/**
 * @author weijiangquan
 * @date 2022/4/28 -16:18
 *
 *
 *
 *
 *
 */
public class InnerClassTest1 {


    //开发中少见
    public void method(){
        //局部内部类
        class AA{

        }
    }


    //开发中常见(这个比较常用)
     //返回一个实现了Comparable接口的类对象
    public Comparable getComparable(){
        //创建一个实现了Comparable接口的类:局部内部类
        // 方法一
        /*class MyComparable implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();*/

        // 方式二

        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}

