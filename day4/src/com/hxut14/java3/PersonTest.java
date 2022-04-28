package com.hxut14.java3;

/**
 * @author weijiangquan
 * @date 2022/4/27 -19:33
 */
public class PersonTest {
    public static void main(String[] args) {
        method(new Student()); //匿名对象


    }

    public static void method1(Person p){
        p.eat();
    }

    public static void method(Student s){

    }

}

class Student extends Person{
    public Student(){

    }

    public Student(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("学生吃饭");
    }
}



class Person{
    String name;
    int age;

    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("人吃饭");
    }
}
