package com.hxut.exer;

/**
 * @author weijiangquan
 * @date 2022/4/27 -18:57
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Employee manager = new Manager("库克",1001,5000,50000);
        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }
}
