package com.hxut.team.domain;

import com.hxut.team.service.Status;

/**
 * @author weijiangquan
 * @date 2022/4/29 -18:34
 */
public class Programmer extends Employee{
    private int memberId;  //开发团队中的id
    private Status status;
    private Equipment equipment;


    /**
     * 构造器
     */
    //***********************start**************************************

    public Programmer(){

    }
    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }
    //*****************************end**********************************
}
