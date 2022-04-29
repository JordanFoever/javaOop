package com.hxut.team.domain;

/**
 * @author weijiangquan
 * @date 2022/4/29 -18:19
 */
public class Printer implements Equipment{

    private String name; //机器的型号
    private String type; //机器的类型

    @Override
    public String getDescription() {
        return name+"("+type+")";
    }
    /**
     * 构造器
     */
    //***********************start**************************************

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }
    //*****************************end**********************************

    /**
     * set和get方法
     */
    //***********************start**************************************
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    //*****************************end**********************************
}
