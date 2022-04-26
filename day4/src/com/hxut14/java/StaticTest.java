 package com.hxut14.java;

/**
 * @author weijiangquan
 * @date 2022/4/26 -16:19
 * static关键字的使用
 *
 * 1.static:静态的
 * 2.static可以用来修饰:属性,方法,代码块,内部类
 *
 * 3.使用static来修饰属性:静态变量
 *             3.1属性是否使用static修饰,又分为静态属性vs非静态属性(实例变量).
 *             实例对象:我们创建类的多个对象,每一个对象都独立拥有一套类中的非静态属性.当修改一个对象中的非静态属性时
 *                   不会导致其它对象中同样的属性值修改
 *             静态变量:我们创建了类的多个对象,多个对象共享一个静态变量.当通过某一个对象修改静态变量的时候
 *             会导致其它对象调用此静态变量的时候,是修改过的
 *             3.2 static修饰属性的其它说明
 *                 ① 静态变量随着类的加载而加载的 可以通过 类.静态变量的方式进行调用
 *                 ② 静态变量的加载早于对象的创建
 *                 ③ 由于类只加载一次,则静态变量在内存中只会存在一份  存在方法区的静态域中
 *
 *                 ④        类变量              实例对象
 *                 类         yes                 no
 *                 对象        yes                 yes
 *               3.3 静态属性的举例 :System.out Math.PI
 *
 * 4.使用static修饰方法
 *          ① 随着类的加载而加载 可以同类.方法()调用
 *                  静态方法    非静态方法
 *          类       yes          no
 *          对象     yes           yes
 *          不能通过类掉用非静态的方法
 *         ②静态方法中只能调用静态方法或静态的属性
 *         非静态方法中:既可以调用非静态的方法或属性
 *
 * 5.static的注意:
 *      5.1 在静态的方法内:不能使用this关键字,super关键字
 *      5.2 关于静态属性和静态方法的使用,都从声明周期的角度去解释
 *
 * 6 开发中:如何确定一个属性要声明为static?
 *      属性可以被多个对象所共享的,不会随着对象的不同而不同
 *
 *    开发中:如何确定一个方法是否要声明为static?
 *      操作静态属性的方法,通常设置为static
 *      工具类中的方法,习惯声明为static的,比如Math,Arrays,Collection
 */
public class StaticTest {
    public static void main(String[] args) {

        Chinese.nation = "das"; //
        System.out.println(Chinese.nation);
        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;


        Chinese  c2 = new Chinese();
        c2.name = "马龙";
        c2.age = 30;

        Chinese.show();


    }

}
class Chinese{
    String name;
    int age;
    static String nation;


    public static void show(){
        System.out.println("hello");
    }
}
