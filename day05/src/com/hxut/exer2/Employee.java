package com.hxut.exer2;

/**
 * @author weijiangquan
 * @date 2022/4/27 -20:20
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;


    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString();
    }

    // ", birthday=" + birthday.toDateString() +注意这个地方,自动生成的是birthday

    public abstract double earning();
}
