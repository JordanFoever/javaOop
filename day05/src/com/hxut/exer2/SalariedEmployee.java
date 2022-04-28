package com.hxut.exer2;

/**
 * @author weijiangquan
 * @date 2022/4/27 -20:28
 *
 * 按月计算工资
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;//月工资


    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday,double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }


    @Override
    public double earning() {
            return monthlySalary;
    }

    public String toString(){
        return "SalariedEmployee["+super.toString()+"]";
    }


}

