package com.hxut12.java3;

/**
 * @author weijiangquan
 * @date 2022/4/18 -21:12
 *
 *
 *  面向对象的特征三:多态性 （运行时多态        ）
 *
 *  1.理解多态:一个事物的多种形态。
 *  2.何为多态性:父类的引用指向子类的对象(或者子类的对象赋给父类的引用)
 *  3.多态的使用，虚拟方法的调用
 *     有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，
 *     但是在执行期，我们实际执行的是子类重写父类的方法
 *  总结:编译看左边，运行看右边
 *
 *  4.多态的使用的前提:①类的继承关系 ②要有方法的重写
 *
 *  5.对象的多态性:只适用于方法，不适用于属性(编译和运行都看左边)
 *
 *
 *  为什么super(...)或this(...)调用语句只能作为构造器中的第一句出现？
 *  答：无论通过哪个构造器继承父类后，继承父类中所有的属性和方法，因此子类有必要知道父类如何为对象进行初始化
 *
 *
 */
public class PersonTest{

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man =new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        //************************************
        System.out.println("***********************");
        //***************************************
        //对象的多态性 父类的引用指向子类的对象
        Person p2 = new Man();
        // Person p3 = new Woman();
        // 多态的使用,当调用子父类同名的方法时，实际执行的是子类重写父类的方法---虚拟方法调用
        p2.eat();
        p2.walk();

        System.out.println(p2.id); //1002 调用的事父类的方法
        System.out.println("************************************");
        // 不能调用子类特有的方法和属性(注意)
        // p2.isSmoking;//会报错  isSmoking是子类所特有的方法 不能通过父类的引用调用
        /*有了类的多态性以后,内存中实际上是加载了子类特有的属性和方法,但是由于变量声明为父类类型,导致
                编译的时候,只能调用父类中声明的属性和方法,子类特有的属性和方法不能调用
        */

        // 如何才能调用子类所特有的方法 使用强制类型转换符
        Man m1= (Man)p2;
        System.out.println(m1.isSmoking);
        System.out.println(m1.id);
        System.out.println("m1的地址"+m1);
        System.out.println("p2的地址"+p2);

        /*Woman w1 = (Woman)p2;
        w1.goShopping();*/

        // instanceof关键字的使用


        /**
         *  a instanceof A:判断对象a是否是类A的实例 如果是,返回true,不是就返回false
         *
         *
         *  使用情况:为了避免向下转型时出现CalssCastException的异常,我们在向下转型之前,先进行
         *  instanceof判断,一旦返回true,就进行向下转型.如果是false就终止.
         *
         *  如果a instanceof A 返回true,其中类B是类A的父类则a instanceof B也返回的是true
         *
         */

        if(p2 instanceof Woman){
            Woman w1 = (Woman)p2;
            w1.goShopping();
            System.out.println("*********Woman*********");
        }
        if(p2 instanceof Man){
            Man m2 = (Man)p2;
            m2.earnMoney();
            System.out.println("**********Man*************");
        }
        if(p2 instanceof Person){
            System.out.println("***********Person********");
        }
        if(p2 instanceof Object){
            System.out.println("*********Object*********");
        }

        // 练习一
        // 问题一:编译的时候通过,运行的时候不同
        // 举例一：
        Person p3 = new Woman();
        Man m3 = (Man)p3;
        // 举例二
        Person p4 = new Person();
        Man m4 = (Man)p4;

        //问题二：编译和运行都通过(Object)
        Object obj = new Woman();
        Person p = (Person)obj;


        // 问题三
        // 编译不过
        // Man m5 = new Woman();








    }
}

