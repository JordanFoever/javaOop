package com.hxut13.exer1;

/**
 * @author weijiangquan
 * @date 2022/4/25 -18:50
 *
 *
 */
public class Test{

    public static void main(String[] args) {
        Test test = new Test();

        // 计算面积
        Circle c1 = new Circle(2.3,"white",1.0);
        test.displayGeometricObject(c1);

        Circle c2 = new Circle(3.3,"white",1.0);
        test.displayGeometricObject(c2);

        // 判断面积是否相等
        boolean isEquals = test.equalsArea(c1,c2);
        System.out.println("c1和c2是否相等:"+isEquals);

    }

    //比较两个图形的面积是否相等
    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }

    //求面积
    public void displayGeometricObject(GeometricObject o){  //多态 在开发中多态被大量的使用
        System.out.println("面积为:"+o.findArea());
    }
}












