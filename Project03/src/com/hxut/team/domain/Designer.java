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

    /**
     * set和get方法
     */
    //***********************start**************************************
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    //*****************************end**********************************

    /***
     * getDetails()是从他的父类传过来的,他的父类又是从自己的父类传过来的
     * @return
     */
    @Override
    public String toString() {
        return getDetails()+"\t设计师\t"+getStatus()+"\t"+bonus+"\t"+"\t\t"+getEquipment().getDescription();
    }


    public String getDetailsForTeam(){
        return getTeamBaseDetails()+"\t设计师"+getBonus();
    }

}
