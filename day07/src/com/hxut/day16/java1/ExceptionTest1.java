package com.hxut.day16.java1;

import org.junit.Test;

/**
 * @author weijiangquan
 * @date 2022/4/28 -18:40
 *
 * 异常处理:抓抛模型
 * 过程一:"抛",程序在执行的过程中,一旦出现异常,就会在异常代码出生成一个对应异常类对象
 *              并将此对象抛出
 *              一旦抛出异常,其后的代码将不再执行
 *
 * 过程二:"抓",可以理解为异常的处理模式: ①try-catch-finally ②throws
 *
 *
 * 二.try-catch-finally的使用
 *
 * try{
 *     //可能出现异常的代码
 * }catch(异常类型1,变量名1){
 *     //处理异常的方式
 * }catch(异常类型1,变量名1){
 *     //处理异常的方式
 * }finally{
 *     //一定会执行的代码
 * }
 *
 * 快捷键 ctrl+alt+t 选择try-catch
 *
 * 说明:
 *  1.finally是可选的
 *  2.使用try将可能出现异常代码块包装起来,在执行的过程中,一旦出现异常,就会出现一个异常类的对象,根据此对象的类型
 *    ,去catch中进行匹配
 *  3.一旦try中的异常对象匹配到某一个catch时,就进入catch中进行异常的处理,一旦处理完成,就跳出try-catch语句
 *          (没有写finally的情况),继续执行其后的代码
 *  4.catch中的异常类型如果没有子父类的关系,则谁声明在上,没有关系
 *      一旦有子父类的关系,子类的必须写在父类的上面
 *
 *  5.常用的异常处理的方式:① String getMessage()  ② printStackTrace()(常用)
 *
 *  6.在try结构中声明的变量,在出了try结构以后,就不能再调用了
 *
 *
 *  7.体会:体会try-catch-finally处理编译时的异常
 */

public class ExceptionTest1 {

    @Test
    public void test1(){
        String str = "123";
        str = "abc";

        try {
            int num = Integer.parseInt(str);
            System.out.println("hello-------1");
        } catch (NumberFormatException e) {
            // System.out.println("出现数值转换异常了不要着急.....");
            // 自带的两种方式
            // 方式一:简陋版
            // System.out.println(e.getMessage());
            //方式二:详细版
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("出现异常了不要召集");
        }
        System.out.println("hello---------2");

    }
}
