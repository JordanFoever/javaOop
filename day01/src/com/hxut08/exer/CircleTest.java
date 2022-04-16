package com.hxut08.exer;

/**
 * @author weijiangquan
 * @date 2022/4/16 -20:41
 */
public class CircleTest{
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.radius = 2.1;
        /*double area = circle1.findArea();
        System.out.println(area);*/

        circle1.findArea();
    }
}

class Circle{
    double radius;

    //求圆的面积

    /**
     * 方式一
     * @return
     */
    /*public double findArea(){
        double area = Math.PI*radius*radius;
        return area;
    }*/


    // 方式二
    public void findArea(){
       double area = Math.PI*radius*radius;
        System.out.println("面积为"+area);
    }


    // 错误的情况(下面这样写不是很好)
    /*public double findArea(double r){
        double area =  3.14*r*r;
        return area;
    }*/
}


