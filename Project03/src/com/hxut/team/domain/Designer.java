package com.hxut.team.domain;

/**
 * @author weijiangquan
 * @date 2022/4/29 -19:20
 *
 * 设计师的类
 */
public class Designer extends Programmer{
    private double bonus; //奖金

    /**
     * 构造器
     */
    //***********************start**************************************
    public Designer() {
        super();
    }
    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }
    //*****************************end**********************************


}
