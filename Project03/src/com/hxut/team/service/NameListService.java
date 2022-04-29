package com.hxut.team.service;

import com.hxut.team.domain.*;

/**
 * @author weijiangquan
 * @date 2022/4/29 -19:34
 * @Descriptio 负责将Data中的数据封装到Employee[]数组中,同时提供相关操作Employee[]的方法
 *
 */
public class NameListService {

    private Employee[] employees;

    /**
     * 构造器
     * 给employee及数组元素进行初始化
     *
     * 1.根据项目提供的Data类构建相应大小的Employees的数组
     * 2.再根据Data类中的数据构建不同的对象,包括Employee,Programmer,Designer和Architect
     * 3.将对象存于数组中
     */
    //***********************start**************************************
    public NameListService(){
        employees = new Employee[Data.EMPLOYEES.length];
        for(int i = 0;i<employees.length;i++){
            //获取员工的类型
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);

            // 获取Employee的4个基本信息(这四个是所有员工都有的)
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            int salary = Integer.parseInt(Data.EMPLOYEES[i][4]);

            // Equipment equipment = createEquipment(i);这样写会出问题,马云没有设备,你创的化不好
            Equipment equipment;
            double bonus; //奖金
            int stock; //股票

            switch (type){
                case Data.EMPLOYEE:    //普通员工
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case Data.PROGRAMMER:   //程序员
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case Data.DESIGNER:   //设计师
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case Data.ARCHITECT:  //架构师
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }
    }
    //*****************************end**********************************
    /**
     * 获取指定index上的员工的设备
     * @param index
     * @return
     */
    private Equipment createEquipment(int index){
        int key = Integer.parseInt(Data.EQIPMENTS[index][0]);

        String modelOrName =Data.EQIPMENTS[index][1];

        switch (key){
            case  Data.PC:  //21 设置成常量的化,当需要发生改变的时候就只用改一遍就好了(并且这样可读性更好)
                String display = Data.EQIPMENTS[index][2];
                return new PC(modelOrName,display);
            case Data.NOTEBOOK: //22
                double price = Double.parseDouble(Data.EQIPMENTS[index][2]);
                 return new NodeBook(modelOrName,price);
            case Data.PRINTER: //23
                String type = Data.EQIPMENTS[index][2];
                return new Printer(modelOrName,type);
        }
        return null;
    }

    public Employee[] getAllEmployees(){
        return null;
    }

    public Employee getEmployee(int id){
        return null;
    }

}

