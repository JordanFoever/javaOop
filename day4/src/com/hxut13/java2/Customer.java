package com.hxut13.java2;

/**
 * @author weijiangquan
 * @date 2022/4/25 -20:43
 */
public class Customer {
    private String name;
    private int age;


    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    // 重写的原则:比较两个对象的实体内容(在本类中即:name和age)是否相同
    @Override
    public boolean equals(Object obj){
        System.out.println("我是重写之后的this"+this);
        if(this == obj){
            return true;
        }
        if(obj instanceof Customer){
            Customer customer = (Customer)obj;
            //比较两个对象的每一个属性是否都相同
            return this.age == customer.age && this.name.equals(customer.name);
        }

        return false;
    }


    // 手写的 (以后用它自动生成的就行了，没有必要自己写)
    public String toString(){
        return "Customer[name="+name+","+"age="+age+"]";
    }



    // 下面是自动生成的
/*
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/

}

