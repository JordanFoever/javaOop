package com.hxut.day16.java1;

import org.junit.Test;

/**
 * @author weijiangquan
 * @date 2022/4/28 -19:44
 *
 * try-catch---finally中的finally的使用
 *
 * 1.finally是可选的
 * 2.finally中声明的一定是会被执行的代码,即使catch中又出现异常了,try中有return语句,catch中有return语句
 * 3.什么时候会将东西写再finally中
 *  像数据库的连接,输入输出流,网络编程Socket等资源,JVM是不能自动回收的,我们需要自己手动的进行资源的释放
 *    ,此时的资源的释放,就需要声明在finally中
 *
 *
 *
 *
 * */
public class FinallyTest{


    @Test
    public void test1(){

        try {
            int a =  10;
            int b = 0;
            System.out.println(a/b);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("我好帅啊");
        }

    }
}
