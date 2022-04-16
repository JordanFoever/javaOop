package com.hxut08.java;

/**
 * @author weijiangquan
 * @date 2022/4/16 -19:07
 */
class User{
    //属性 (或成员变量)
    String name;
    public int age;
    boolean isMale;

    public void talk(String language){  //形参也是局部变量
        /*String name;
        System.out.println(name);//run result=>报错*/

        System.out.println("我使用的"+language+"进行交流");
    }

    public void eat(){
        String food = "hajskd"; //局部变量
    }
}
