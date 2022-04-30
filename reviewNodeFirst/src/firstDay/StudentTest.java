package firstDay;

import java.util.Arrays;

/**
 * @author weijiangquan
 * @date 2022/4/30 -10:36
 * @Description
 */
public class StudentTest{
    public static void main(String[] args) {
        // 声明一个Student类型的数组
        Student[] stus= new Student[2];
        Student student = new Student();
        student.number = 12;
        student.state = 1;
        student.score = 150;
        stus[0] = student;

        Student student1 = new Student();
        student1.number = 12;
        student1.state = 1;
        student1.score = 150;
        stus[1] = student1;

        // 下面打印地址可以知道对象数组的地址和数组元素的第一个元素的地址是不一样
        // 在普通的数组中就是数组的首地址
        System.out.println("整个数组地址"+stus); //run result=>整个数组地址[LfirstDay.Student;@1b6d3586
        System.out.println("数组中第一个对象元素的地址:"+student); //run result=>数组中第一个对象元素的地址:firstDay.Student@4554617c
        System.out.println("掉用toString方法之后:"+Arrays.toString(stus));//run result=>掉用toString方法之后:[firstDay.Student@4554617c, firstDay.Student@74a14482]

        // 获取数组某一个对象的属性(私有的不能获取)
                //获取成员属性
        int number = stus[0].number;
        int score = stus[0].score;
                //获取成员方法
        String info = stus[0].info();
        System.out.println("number="+number+"\t"+"score="+score+"\tinfo:"+info);
                        //run result=>number=12	score=150	info:学号12,年级1,成绩150
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