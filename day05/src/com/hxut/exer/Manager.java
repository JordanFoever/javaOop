package com.hxut.exer;

/**
 * @author weijiangquan
 * @date 2022/4/27 -18:54
 */
public class Manager extends Employee{

    private double bonus; //奖金

    @Override
    public void work() {
        System.out.println("管理员工,保证公司赚取更多的钱");
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
}
