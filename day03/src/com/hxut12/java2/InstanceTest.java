package com.hxut12.java2;

/**
 * @author weijiangquan
 * @date 2022/4/18 -20:18
 *
 *
 * 子类对象实例化的全过程
 *   1.从结构来看，
 *      子类继承父类以后就获取了父类中声明的属性和方法
 *      创建子类对象，在对空间中，就会加载所有父类中声明的属性
 *      喜欢就是不喜欢
 *  2.从过程上看
 *      当我们通过子类的构造器创建子类对象时，我们一定会直接或间接的调用父类的构造器，进而调用父类的父类的构造器
 *      直到调用了java.lang.Object类中空参的构造器为止，正因为加载所有父类中得到结构，所以才可以看到内存
 *      中有父类中的结构，子类对象才可以考虑进行调用
 *
 *  明确:虽然创建子类的对象时，调用了父类的构造器，但是自始自终就创建过一个对象，即为new的子类对象
 *
 *
 */
public class InstanceTest{
}
