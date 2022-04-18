package com.hxut12.java2;

/**
 * @author weijiangquan
 * @date 2022/4/18 -19:29
 */
public class Student extends Person{

    String major;
    int age;
    int id = 110;  //学号 属性不会被覆盖(注意)


    /**
     * 默认调用了super()
     */
    public Student(){

    }

    public Student(String major){
        this.major = major;
    }

    public Student(String name,int age,String major){
        super(name,age);  //调用父类指定参数的构造器
        this.major= major;
    }

    @Override
    public void eat(){
        System.out.println("学生,多吃有营养的食物");
    }

    public void study(){
        System.out.println("学生,学习知识");
    }

    public void show(){
        System.out.println("name="+this.name+",age="+super.age);
        System.out.println("id="+this.id); //run result=>id=110
        System.out.println("id="+super.id); //run result=>id=420
    }
}
