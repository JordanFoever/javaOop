package com.hxut.exer;

/**
 * @author weijiangquan
 * @date 2022/4/27 -18:51
 *
 * 练习题目
 *
 */
public abstract class Employee {

    private String name;
    private int id;
    private double salary;
    public Employee(){
        super();
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();
}
