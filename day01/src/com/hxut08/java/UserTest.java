package com.hxut08.java;

/**
 * 类中属性的使用
 *
 * 属性(成员变量) vs 局部变量
 *
 * 1.相同点
 *      1.1 定义变量的格式:数据类型 变量名 = 变量值
 *      1.2 先声明 后使用
 *      1.3 都有作用域
 * 2.不同点
 *      2.1在类中的声明位置不同
 *          属性:直接定义在一个
 *      局部变量:声明在方法内,方法形参,代码块内,构造器形参,构造器内部的变量
 *
 *      2.2 关于权限修饰符不同
 *       属性:可以指定权限
 *         常用的  private public 缺 protected
 *         目 前使用缺就可以了
 *        局部变量:不可以写修饰符
 *      2.3 默认初始化的情况
 *      属性: 类的属性 根据其类型 都有默认初始化值
 *              整型 (byte short int long ) ->0
 *              浮点型(char) ->0或('\u0000')
 *              布尔型(boolean),false
 *              引用数据类型(类,数组,接口):null
 *
 *        局部变量:没有默认初始化值
 *        也就是说我们在调用局部变量之前,一定要显示赋值
 *        特别的形参在调用的时候赋值就可以了
 *       2.4 在内存中加载的位置
 *       属性:加载到堆空间中  (非static)
 *       局部变量:加载到栈空间中
 * @author weijiangquan
 * @date 2022/4/16 -18:39
 */
public class UserTest{
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.name); //run result=>nul
        System.out.println(u1.age); //run result=>0
        System.out.println(u1.isMale); //run result=>false


    }
}


