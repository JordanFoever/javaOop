package com.hxut10.java1;

/**
 * @author weijiangquan
 * @date 2022/4/17 -19:47
 *
 *
 */
public class Customer{
    // 默认的构造器权限和类的权限一样

    private int id;
    private String name;


    public Customer(){

    }

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }


}
