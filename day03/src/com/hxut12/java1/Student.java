package com.hxut12.java1;

/**
 * @author weijiangquan
 * @date 2022/4/18 -17:41
 */
public class Student extends Person{
    String major;

    public Student(){

    }

    public Student(String major){
        this.major =major;
    }

    /**
     * 对于父类的方法进行了重写
     */
    public void eat(){
        System.out.println("子类学生吃饭有营养");
    }

    // void eat(){
    //     System.out.println("学生吃饭有营养");
    // }会报错


    public void study(){
        System.out.println("学习的专业是"+major);
    }

    /**
     * 由于父类是私有的,所以这里不是重写的父类的方法,而是自己新写的一个方法
     *
     */
    public void show(){
        System.out.println("学生子类的show方法");
    }


    /**
     * 重写String是Object的子类
     * @return
     */

    public String info(){
        return null;
    }



    /**
     * 下面这样重写就会报错
     * @return
     */
    /*public int aa(){
        return 11;
    }*/


}
