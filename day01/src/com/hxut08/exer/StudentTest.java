package com.hxut08.exer;

/**
 * 4.对象数组
 *     定义学生类Student,包含三个属性 :学号 number(int) 年级 state(int) 成绩score(int)
 *     创建20个学生对象,学号为1到20,年级和成绩都由随机数确定
 *     问题一:打印3年级(state值为3)的学生信息
 *     问题2:使用冒泡排序按学生成绩排序,并遍历所有学生信息
 *
 * @author weijiangquan
 * @date 2022/4/16 -21:09
 */

public class StudentTest{
    public static void main(String[] args) {
        // 声明一个Student类型的数组
        Student[] stus= new Student[20]; //对象数组(这个只是定义了一个数组)
        for (int i = 0;i<stus.length;i++){
            //给数组元素赋值
            stus[i]  = new Student(); //给数组的每一个位置new一个对象
            //给student对象的属性赋值
            stus[i].number = i+1;
            //年级是[1,6]闭区间的画  公式(Math.random()*(b-a+1)+a)(记住公式就可以了)
            stus[i].state = (int)(Math.random()*(6-1+1)+1);
            //成绩:[0-100]
            stus[i].score = (int)(Math.random()*(100-0+1));
        }
        // 遍历一下学生数组
        for (Student value : stus) {
            // System.out.println(stus[i]);//run result=>com.hxut.exer.Student@4554617c(输出的是地址值)

            // ① 用这种(方式一)
            // System.out.println(stus[i].number+","+stus[i].state+","+stus[i].score);
            // ②用这种调用对象中的方法(方式二)
            System.out.println(value.info());
        }
        System.out.println("=============================");
        // 问题1: 打印3年级(state值为3)的学生信息
        for (Student student : stus) {
            if (student.state == 3) {
                System.out.println(student.info());
            }
        }
        System.out.println("=============================");
        // 问题2:使用冒泡排序按学生成绩排序,并遍历所有学生信息
        for (int i = 0;i<stus.length;i++){
            for (int j =0;j<stus.length-1-i;j++){
                if(stus[j].score >= stus[j+1].score){
                    // 如果需要换序,交换的是数组的元素:Student对象
                    Student temp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = temp;
                }
            }
        }
        // 遍历学生数组
        for (Student student : stus) {
            System.out.println(student.info());
        }

    }
}
class Student{
    int number; //学号
    int state; //年级
    int score; //成绩

    // 显示学生信息的方法
    public String info(){
        return "学号"+number+",年级"+state+",成绩"+score;
    }
}











