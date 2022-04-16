package com.hxut08.java;

/**
 *
 *1.类中方法的声明使用
 *  public void eat(){}
 *  public void sleep(int hour){}
 *  public String getName(){}
 *  public String getNation(String nation){}
 *
 * 2.方法地方声明 权限修饰符 返回值类型 方法名(形参列表){方法体}
 *
 * 注意:static,final,abstract 来修饰方法 后面再说
 *      权限修饰符
 *
 *
 *  3.说明
 *      有返回值类型 有返回值 vs 没有返回值类型
 *      如果有必须在声明中指定返回值类型 同时需要使用retrun关键字返回一个给类型的
 *      如果没有返回值就写成 void 通常不用写return 或者写成 return;(这里就是结束方法的目的)
 *
 *           我们定义的方法该不该有返回值?
 *                 1 .题目要求
 *                 2.具体问题具体分析
 *           方法名:就是一个标识符,遵循规范就可以了(见名知意)
 *           3.4 形参列表 (可以声明0个或多个)
 *              3.4.2 我们执行的时候要不要形参?
 *           3.5 方法体 方法功能的实现
 *
 *
 *          return关键字的作用
 *              ① 使用范围:使用在方法体中
 *              ② 作用:①结束方法
 *                     ②针对有返回值类型的方法,使用"return 数据"方法  返回所要的数据
 *              ③ return 后面不能声明可执行语句
 *
 *    5. 方法的使用,可以调用当前类的属性或方法
 *                  方法中又调用自己 递归
 *
 *                  不能在方法中定义别的方法
 *
 * @author weijiangquan
 * @date 2022/4/16 -19:08
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.eat();
        cust1.sleep(4);
    }
}

class Customer{

    String name;
    int age;
    boolean isMale;

    /**
     *
     */
    public void eat(){
        System.out.println("客户吃饭");
    }

    /**
     *
     * @param hour
     */
    public void sleep(int hour){
        System.out.println("休息了"+hour+"小时");
        eat();
    }

    /**
     *
     * @return
     */
    public String getName(){
        return name;
    }

    public String getNation(String nation){
        String info = "我的国籍是"+nation;
        return info;
    }

}
