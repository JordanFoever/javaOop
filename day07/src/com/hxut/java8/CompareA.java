package com.hxut.java8;

/**
 * @author weijiangquan
 * @date 2022/4/28 -14:22
 *
 *  JDK8中:除了定义全局常量和抽象方法外,还可以定义静态方法,默认方法
 *
 *
 */

class SubClassTest{
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.method2();

        //s.method1(); //报错)
        //知识点一:接口中定义的静态方法,只能通过接口来调用
        CompareA.method1();

        //知识点二:通过实现类的对象,可以调用接口中默认方法
            //如果实现类重写了接口中的默认方法,调用时,仍然调用的时重写以后的方法

        s.method2();

        //知识点三:如果子类(或实现类)继承父类和实现接口中声明了同名同参数的方法
                     //那么子类在没有重写此方法的情况下,默认调用的时父类中同名同参数的方法 -->类优先原则(仅针对的时方法)
                    //知识点4:如果实现类实现了多个接口,而这多个接口中定义了同名同参数的默认方法,
                        //那么在实现类没有重写的情况下,报错---->接口冲突
                            //就必须要我们在此实现类中重写此方法
        // 知识点五:如何在子类(或实现类中嗲用父接口中的被重写的方法) 如 CompareA.super.method3() 其中CompareA是父接口


        s.method3();
   }
}

public interface CompareA {
    //静态方法
    public static void method1(){
        System.out.println("CompareA:北京");
    }

    // 默认方法
    public default void method2(){
        System.out.println("CompareA:上海");
    }
    // 默认方法
    default void method3(){
        System.out.println("CompareA:上海");
    }

}
class SubClass extends SuperClass implements CompareA,CompareB{
    public void method2(){
        System.out.println("SuperClass:北京");
    }
}
class SuperClass{
    public void method3(){
        System.out.println("SuperClass:北京");
    }
}
interface CompareB{
    default void method() {
        System.out.println("CompareB:o上海");
    }

}
