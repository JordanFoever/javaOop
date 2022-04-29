package com.hxut.team.domain;

/**
 * @author weijiangquan
 * @date 2022/4/29 -18:06
 */
public class PC implements Equipment{

    private String model; //机器的型号
    private String display; //显示操作


    @Override
    public String getDescription() {
        return model+"("+display+")";
    }



    /**
     * 构造器
     */
//***********************start**************************************
    public PC(String model) {
        this.model = model;
    }
    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }
//*****************************end**********************************


    /**
     * get和set方法
     */
//***********************start**************************************//
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
//*****************************end**********************************


}
