package com.hxut.team.domain;

/**
 * @author weijiangquan
 * @date 2022/4/29 -18:31
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    /**
     * 构造器
     */
    //***********************start**************************************

    public Employee() {
        super(); //默认调用
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    //*****************************end**********************************

    /**
     * set和get方法
     */
    //***********************start**************************************

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //*****************************end**********************************

    public String getDetails(){
        return id+"\t"+name+"\t"+age+"\t"+salary;
    }


    @Override
    public String toString() {
      return getDetails();
    }
}
