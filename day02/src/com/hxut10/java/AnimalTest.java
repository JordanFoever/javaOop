package com.hxut10.java;

/**
 * @author weijiangquan
 * @date 2022/4/17 -14:11
 *
 *
 * 面向对象的特征:封装和隐藏
 *
 * 一:问题的引入:
 *   当我们创建一个类的对象以后,我们可以通过"对象.属性"的方式,对对象进行赋值
 *   我们要加入额外的限制条件.通过方法进行限制,避免用户直接,我们可以讲属性搞成private,这个时候属性就是封装性了
 *
 * 二:封装性的体现
 *  属性的私有化 提供get和set的方法给外部
 *  这个是封装性的体现不等于封装(这个只是其中的一个)
 *
 *  体现有很多
 *  ①上面 ②私有方法 ③单例模式 ...
 *
 *  三.封装性的体现 需要权限修饰符
 *  1.java规定的4种权限(小->大) private 缺省(默认)protected public
 *
 *
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        // a.name = "大大";
        // a.age  =21;
        // a.legs = 4;
        a.show();
        a.eat();


    }
}

class Animal{


    private String name;
    private int age;
    private int legs; //退的个数

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

    // 设置属性
    public void setLegs(int le){
        if(le>0&&le%2==0){
            legs = le;
        }else {
            legs =0;
        }
    }

    //获取属性
    public int getLegs(){
        return legs;
    }

    public void eat(){
        System.out.println("动物吃饭");
    }

    public void show(){

        System.out.println(name+age+legs);
    }
}

