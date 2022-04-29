package com.hxut.team.domain;

/**
 * @author weijiangquan
 * @date 2022/4/29 -18:15
 */
public class NodeBook implements Equipment{
    private String mode; //机器型号
    private double price; //价格

    @Override
    public String getDescription() {
        return mode+"("+price+")";
    }
    /**
     * 构造器
     */
    //***********************start**************************************
    public NodeBook() {

    }
    public NodeBook(String mode, double price) {
        this.mode = mode;
        this.price = price;
    }
    //*****************************end**********************************

    /**
     * get和set
     */
    //***********************start**************************************
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //*****************************end**********************************

}
