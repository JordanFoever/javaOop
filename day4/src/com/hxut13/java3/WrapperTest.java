package com.hxut13.java3;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

/**
 * @author weijiangquan
 * @date 2022/4/26 -2:08
 *
 *
 * 包装类的使用:
 * 1.java提供了八种基本数据类型对应的包装类，使得基本数据类型的变量有类的特征
 *
 * 2.掌握:基本数据类型，包装类，String三者之间的相互转换
 *
 */
public class WrapperTest {

    // String类型 --->基本数据类型，包装类 调用包类的parseXxx()
    @Test
    public void test5(){
        String str1 = "123";

        // 错误的情况
        // int num1 = (int)str1;
        // Integer int1 = (Integer)str1;

        // 可能会报NumberFormatException异常
        int num2 = Integer.parseInt(str1);
        System.out.println(num2+1);

        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1); //run result=>true




    }

    //基本数据类型，包装类 ---> String类型 调用String重载的valueOf(Xxx xxx)
    @Test
    public void test4(){

        // 方式一
        int num1 = 10;
        String str1 = num1+" ";

        //方式2  调用String的valueOf(Xxx xxx);
        float f1 = 12.3f;
        String s = String.valueOf(f1);
        System.out.println(s); //run result=>返回的是String

        Double d1 = new Double(12.4);
        String str2 = String.valueOf(d1);
        System.out.println(str2);


    }






    /**
     * JDK 5.0 新特性:自动装箱和自动拆箱
     *
     */
    @Test
    public void test3(){
       /* int num1 = 10;
        //基本数据类型 ---> 包装类的对象
        method(num1); //Object obj = num1;*/

        // 自动装箱
        int num2 = 10;
        Integer int1 = num2;

        boolean b1 = true;
        Boolean b2 = b1; //自动装箱

        //自动拆箱 包装类转换成基本类型
        System.out.println(int1.toString());

        int num3 = int1;


    }

    public void method(Object obj){
        System.out.println(obj);
    }

    // 包装类转换成基本数据类型  调用包装类的 xxxValue()
    @Test
    public void test2(){
        Integer in1 = new Integer(2);
        // 由于包装类不能进行加减乘除的运算，但是我们有时候会有这种运算的需求
        int i1 = in1.intValue();
        System.out.println(i1+1); //run result=>3

        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2+1); //run result=>13.3
    }



    //基本数据类型 --->包装类 调用包装类的构造器
    @Test
    public void test1(){
        int num1 = 10;
        Integer int1 = new Integer(num1);
        System.out.println(int1); //run result=>10
        System.out.println(int1); //run result=>10
        System.out.println(int1.toString());//run result=>10
                                //注意:因为Integer已经重写了toString,所以打印的是内容
        Integer int2 = new Integer("123");
        System.out.println(int2); //run result=>123
        System.out.println(int2.toString());//run result=>123

        // Integer int3 = new Integer("121abc"); //这个会报异常

        Float f1 =new Float(12.3);
        Float f2 = new Float(12.f);
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");

        // Boolean b3 = new Boolean("true123"); //run result=>q会报异常
        Order order = new Order();
        System.out.println(order.isMale); //run result=>false
        System.out.println(order.isFemale); //run result=>null
    }
}

class Order{

    boolean isMale;
    Boolean isFemale;
}
