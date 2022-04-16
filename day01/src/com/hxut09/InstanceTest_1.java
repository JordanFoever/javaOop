package com.hxut09;

/**
 *
 *
 * @author weijiangquan
 * @date 2022/4/16 -23:50
 *
 *
 * 一.理解"万事万物皆对象"
 * 1.在java语言范畴中,我们都将功能,结构等封装到类中,通过类的实例化,来调用具体的功能结构
 * 2.涉及到Java语言与前端Html,后端的数据交互时,前后端的结构java交互时
 *
 *
 * 二.匿名对象的使用
 * 1.理解:我们创建的对象:没有显示的赋给一个变量名.就时匿名对象
 * 2.特征:只能调用一次
 */
public class InstanceTest_1{
    public static void main(String[] args) {
        Phone p =new Phone();
        System.out.println(p); //run result=>com.hxut09.Phone@1b6d3586(输出的对象的地址)

        p.sendEmail();
        p.playGame();

        // 匿名对象(下面new了两个对象)
        new Phone().sendEmail();
        new Phone().playGame();

        // 匿名对象的使用
        PhoneMall mall = new PhoneMall();
        mall.show(p); //可以这样写
        mall.show(new Phone()); //开发中这样写会更多
    }
}

class PhoneMall{

    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}

class Phone{
    double price;

    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }
}

