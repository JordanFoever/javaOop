package com.hxut.java;

/**
 * @author weijiangquan
 * @date 2022/4/27 -18:33
 *  abstract使用上的注意点
 *      1.abstract不能用来修饰:属性,构造器等结构
 *              Tips(如果构造器定义成抽象的话,那么子类就必须要重写它,显然在前面的继承中提到过构造是只能重载的,不能重写(因为名字不一样),故构造器不能是抽象的)
 *      2.abstract不能修饰私有方法
 *              Tips(私有方法显然是不不能重写的,但是继承抽象类的话,就要重写抽象方法,显然相互矛盾)
 *        abstract 不能修饰静态方法(有点疑惑)
 *        final方法
 *
 */
public class AbstractTest1 {

}
