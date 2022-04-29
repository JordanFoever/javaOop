package com.hxut.day17.java2;

/**
 * @author weijiangquan
 * @date 2022/4/29 -16:14
 *
 *
 *
 */
public class StudentTest{

    public static void main(String[] args) throws Exception {
        try {
            Student student =new Student();
            student.regist(-1001);
            System.out.println(student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 输入的是非法的时候
    }
}
class Student {
   int id;

   public void regist(int id) throws Exception {
       if(id>0){
           this.id = id;
       }else {
           // throw new RuntimeException("输入的数据非法"); //运行时的异常
           // throw new Exception("您输入的数据非法");
           throw new MyException("不能输入负数");
       }
   }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }

}


