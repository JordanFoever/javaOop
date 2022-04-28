package com.hxut.day16.java1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

/**
 * @author weijiangquan
 * @date 2022/4/28 -18:06
 *
 *
 * 一.异常的体系结构
 *   java.lang.Throwable
 *     |----java.lang.Error:一般不编写针对性的代码进行处理
 *     |----java.lang.Exception:可以进行异常的处理(常见的如下)
 *          |---编译时异常(checked)
 *                 |----IOException
 *                     |---ClassNotFoundException
 *          |---运行时异常(unchecked)
 *                  |--NullPointerException
 *                  |--ArrayIndexOutOfBoundsException
 *                  |--NumberFormatException
 *                  |--ArithmeticException
 *
 */
public class ExceptionTest {


    //***************************************
    // 以下是编译时的异常
    public void test7(){
        /*File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while (data!=-1){
            System.out.println((char)data);
            data = fis.read();
        }
        fis.close();*/
    }


    //******************下面是运行时的异常***********************
    // NullPointerException
    @Test
    public void test1(){
        /*int[] arr = null;
        System.out.println(arr[3]);*/

    }

    // ArrayIndexOutOfBoundsException
    @Test
    public void test2(){
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    // ClassNotFoundException
    @Test
    public void test3(){
        Object obj = new Date();
        String str = (String)obj;
    }

    // NumberFormatException
    @Test
    public void test4(){
        // 这个可以转
        /*String str = "123";
        int num = Integer.parseInt(str);*/


        // 这个不可以转
        String str = "abc";
        int num = Integer.parseInt(str);
    }


    // ArithmeticException
    @Test
    public void test6(){
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }
}
