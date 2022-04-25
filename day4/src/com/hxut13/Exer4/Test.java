package com.hxut13.Exer4;

/**
 * @author weijiangquan
 * @date 2022/4/26 -1:33
 *
 * 判断两个对象的颜色是否相同
 * 利用equals方法判断半径是否相等，利用toString()方法输出其半径
 */
public class Test {
    public static void main(String[] args) {

        Circle circle = new Circle(2.3);
        Circle circle1 = new Circle(2.3,"white",2.0);


        System.out.println("颜色是否相等"+circle.getColor().equals(circle1.getColor()));

        System.out.println("半径是否相等"+circle1.equals(circle));//对象比的就是半径(因为对于它进行了重写)

        System.out.println(circle); //run result=>Circle{radius=2.3}
        System.out.println(circle1); //run result=>Circle{radius=2.3}
    }
}

