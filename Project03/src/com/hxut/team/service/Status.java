package com.hxut.team.service;

/**
 * @author weijiangquan
 * @date 2022/4/29 -18:37
 *
 *
 * 表示员工的状态
 */
public class Status {

    private final String NAME;  //final类型的要初始化

    private Status(String name){
           this.NAME = name;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status  VOCATION  = new Status("VOCATION");


    /**
     * get的方法(由于是final并且给了初始值,所以不需要set方法了)
     */
    public String getNAME() {
        return NAME;
    }
    //*****************************end**********************************
}

