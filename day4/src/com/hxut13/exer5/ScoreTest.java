package com.hxut13.exer5;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author weijiangquan
 * @date 2022/4/26 -8:40
 *
 * 包装类的练习题
 *
 *
 *
 *
 */
public class ScoreTest {
    public static void main(String[] args) {
        // 1.实例化Scanner,用于从键盘获取学生成绩
        Scanner sc = new Scanner(System.in);

        //2.创建Vector对象,Vector v = new Vector();相当于原来的数组
        Vector v = new Vector();


        //3.for(;;)或while(true)方式,给Vector中添加数据 v.addElement(Object obj)
        int maxScore = 0;
        for(;;){
            System.out.println("请输入学生成绩");
            int score = sc.nextInt();
            // ②当输入负数的时候退出循环
            if(score<0){
                break;
            }
            if(score>100){
                System.out.println("输入的数据非法,请重新输入");
                continue; //这个地方就用的很妙
            }
            // ①添加操作 v.addElement(Object obj)

            /*Integer inScore = new Integer(score);
            v.addElement(inScore);*/

            v.addElement(score); //自动装箱

            // 4.获取学生成绩的最大值
            if(maxScore<score){
                maxScore = score;
            }

        }
        char level;

        for(int i = 0;i<v.size();i++){
            Object obj = v.elementAt(i);
            //在jdk之前
            /*Integer inscore = (Integer)obj;
            int score = inscore.intValue();*/

            // jdk5.0之后
            int score = (int)obj;
            if(maxScore -score<=10){
                level = 'A';
            }else if(maxScore-score<=20){
                level = 'B';
            }else if(maxScore-score<=30){
                level = 'C';
            }else {
                level = 'D';
            }

            System.out.println("student-"+"score is"+score+",grade is"+level);

        }

    }
}
