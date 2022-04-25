package com.hxut13.Exer4;

/**
 * @author weijiangquan
 * @date 2022/4/26 -1:21
 */
public class Circle extends GeometricObject{

    private double radius;

    public Circle(){
        super();
        radius = 1.0;
        // color = "white";
        // weight = 1.0;
        // 上面的两行代码super已经干了,有点多余

    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // 求圆的面积
    public double findArea(){
        return 3.14*radius*radius;
    }

    // 比较两个圆的半径是否相等
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Circle){
            Circle c = (Circle)obj;
            return this.radius == c.radius;
        }
        return false;
    }

    // 重写toString
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
