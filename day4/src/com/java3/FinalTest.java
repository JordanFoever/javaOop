package com.java3;

/**
 * @author weijiangquan
 * @date 2022/4/26 -23:40
 *
 *
 * Final:最终的
 *
 *  1.final可以用来修饰结构,类,方法,变量
 *
 *  2.final 用来修饰一个类:不能被其它的类所继承
 *              比如String类 System类 StringBuffer类
 *
 *  3.final修饰一个方法:表明此方法不可以被重写
 *         比如:Object中的getClass()获取当前对象所处的类
 *
 *  4.final 用来修饰变量:此时的变量就称为是一个常量
 *            4.1 final修饰属性,可以考虑值的位置有 显式初始化,代码块中初始化,构造器中初始化
 *                                                     在方法中是不行的
 *           4.2 final修饰的局部变量
 *                      尤其是使用final修饰形参时,表明此形参是一个常量.当我们调用此方法时
 *                              给常量形参赋制一个形参.一旦赋值以后,就只能在方法体内使用
 *                              此形参,但不能进行重新赋值
 *  static final 用来修饰属性:全局常量
 *
 *
 *
 *  对于省份证可以
 *    public void aaa(final int ia){}
 *
 *
 *
 * */
public class FinalTest {

}


































