package com.hxut09.exer;


import com.sun.org.apache.xerces.internal.xinclude.XInclude11TextReader;

/**
 * @author weijiangquan
 * @date 2022/4/17 -12:09
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject test = new PassObject();

        Circle c= new Circle();

        test.printAreass(c,9);

        System.out.println("now radius is"+c.radius);

        

    }
    public void printAreass(Circle c,int time){
        System.out.println("Radius\t\tArea");

        //设置圆的半径
        for (int i =1;i<=time;i++){
            c.radius = i;
            System.out.println(c.radius+"\t\t"+c.findArea());
        }

        c.radius = time+1;

    }
}
