package com.hxut08.exer;

/**
 * @author weijiangquan
 * @date 2022/4/16 -20:28
 */
public class Person{

    String name;
    int age;
    int sex;

    public void study(){
        System.out.println("Xstuding");
    }

    public void showAge(){
        System.out.println(age);
    }

    public int addAge(int i){
        age +=i;
        return age;
    }
}
