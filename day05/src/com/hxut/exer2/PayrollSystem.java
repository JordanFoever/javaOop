package com.hxut.exer2;

import javafx.scene.transform.Scale;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/27 -20:55
 *
 * 测试类
 */
public class PayrollSystem {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入当前的月份");
        int month = sc.nextInt();
        */

        // 方式二(得到当前的月份)
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        System.out.println("当前的月份是:"+(month+1)); //run result=>月份是从0开始的


        Employee[] emps = new Employee[2]; //创建的是数组(数组不是对象  用父类类型的数组存放子类)

        emps[0] = new SalariedEmployee("马森",1002,new MyDate(1333,4,28),1000);

        emps[1] = new HourlyEmployee("小陈",2001,new MyDate(1991,5,6),60,240);

        for(int i = 0;i<emps.length;i++){
            System.out.println(emps[i]);
            double salary = emps[i].earning();
            System.out.println("月工资为:"+salary);

            if((month+1) == emps[i].getBirthday().getMonth()){
                System.out.println("生日快乐奖励100元");
            }

        }
    }
}
