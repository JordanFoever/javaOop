package com.hxut14.java;

/**
 * @author weijiangquan
 * @date 2022/4/26 -17:56
 */


public class CircleTest{
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.1);
        System.out.println("c1的id:"+c1.getId()); //run result=>1001
        System.out.println("c2的id:"+c2.getId()); //run result=>1002
        System.out.println("c3的id:"+c3.getId()); //run result=>1003

        System.out.println("创建的圆的个数为"+Circle.getTotal()); //run result=>2
    }
}


class Circle {
    private double radius;
    private int id;

    public Circle(){
        id = init++; //多个对象共享
        total++;
    }

    public Circle(double radius){
        this();
        this.radius = radius;
        /*id = init++; //多个对象共享
        total++;*/
        // 或者写成这样

    }
    private static int  total; //记录对象被创造了多少次
    private static int init = 1001; //static声明的属性被所有对象共享


    public double findArea(){
        return 3.14*radius*radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // id和total都只需要get方法就可以了
    public int getId(){
        return id;
    }

    public static int getTotal() {
        return total;
    }
}