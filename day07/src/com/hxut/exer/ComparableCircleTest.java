package com.hxut.exer;

/**
 * @author weijiangquan
 * @date 2022/4/28 -13:55
 *
 * 比较两个对象的大小(在这里实际上是比较两个对象中某一个属性大下)
 *
 *
 *
 */

public class ComparableCircleTest{
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.4);
        ComparableCircle c2 = new ComparableCircle(4.4);
        int compareValue = c1.compareTo(c2);
        if(compareValue>0){
            System.out.println("c1对象大");
        }else if(compareValue<0){
            System.out.println("c2对象大");
        }else {
            System.out.println("一样大");
        }
    }
}

interface CompareObject {

    //若返回值是0,代表相等;若为正数,代表当前对象大,负数代表当前对象小
    public int compareTo(Object o);

}

class Circle{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof CompareObject){
            ComparableCircle c =(ComparableCircle) o;

            //错误的(有漏洞)
            // return  (int)(this.getRadius() - c.getRadius());

            if(this.getRadius()>c.getRadius()){
                return 1;
            }else if(this.getRadius()<c.getRadius()){
                return -1;
            }else {
                return 0;
            }


            //当属性设置为Double(注意这里的D是大写,也就是包装类),可以调用包装类的方法
            //return this.getRadius().CompareTo(c.getRadius());
        }else {
            return 0;
            // 当学了异常之后就可以用下面的这种方式了
           // throw new RuntimeException("传入的数据不合适");
        }
    }
}