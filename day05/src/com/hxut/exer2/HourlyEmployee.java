package com.hxut.exer2;

/**
 * @author weijiangquan
 * @date 2022/4/27 -20:37
 *
 *
 * 按小时计算工资
 *
 *
 */
public class HourlyEmployee extends Employee{

    private int wage;//每小时的工资
    private int hour;//月工作的小时数

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earning() {
        return wage*hour;
    }

    public String toString(){
        return "HourlyEmployee["+super.toString()+"]";
    }

}


