package com.hxut13.java3;

import org.junit.Test;

/**
 * @author weijiangquan
 * @date 2022/4/26 -1:44
 *
 * java中jUnit单元测试
 * 创建的java类的要求:
 *       1.
 *          ①此类是公共的
 *          ②此类提供公共无参的构造器
 *          ③在类中声明单元测试方法
 *          ④此方法的权限是public 没有返回值 没有形参
 *       2.此方法上需要声明注解:@Test,并在单元测试类中导入:import org.junit.Test
 *       3.声明好单元测试后就可以在方法体中写代码了
 *
 *  说明
 *   1.如果执行结果没有任何异常：绿色
 *   2.如果出现结果异常就会显示红条
 *
 *
 */
public class JunitTest {
    int num =10;

    @Test
   public void testEquals(){
        System.out.println("你好,Test");
   }
}

