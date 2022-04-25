package com.hxut13.exer1;

/**
 * @author weijiangquan
 * @date 2022/4/25 -18:43
 */
public class Circle extends GeometricObject{

    public double radius;
    public Circle(double radius,String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14*radius;
    }
}
