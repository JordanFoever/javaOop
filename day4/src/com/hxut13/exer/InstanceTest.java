package com.hxut13.exer;

/**
 * @author weijiangquan
 * @date 2022/4/25 -18:10
 *
 *
 *
 */

public class InstanceTest {
    public static void main(String[] args) {

        InstanceTest test = new InstanceTest();
        test.method(new Student());

    }
    public void method(Person e){  //方法调用的时候多态性的使用
        //虚拟方法调用
        String info = e.getInfo();
        System.out.println(info);

        // 方法一
        if (e instanceof Graduate){
            System.out.println("a Graduate student");
            System.out.println("a student");
            System.out.println("person");
        }else if(e instanceof Student){
            System.out.println("a student");
            System.out.println("person");
        }else {
            System.out.println("person");
        }

        // 方法二
        /*if(e instanceof Graduate){
            System.out.println("a Graduate student");
        }
        if(e instanceof Student){
            System.out.println("a student");
        }
        if(e instanceof Person){
            System.out.println("person");
        }*/

    }
}

class Person{
    protected String name = "person";
    protected int age = 50;
    public String getInfo(){
        return "Name"+name+"\n"+"age"+age;
    }
}

class Student extends Person{
    protected String school = "pku";
    public String getInfo(){
        return "Name"+name+"\n"+"age"+age+"\n"+"school"+"\n"+school;
    }
}
class Graduate extends Student{
    public String major = "IT";
    public String getInfo(){
         return "Name"+name+"\n"+"age"+age+"\n"+"school"+"\n"+school+"\nmajor"+major;
    }
}

