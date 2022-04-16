package com.hxut09.exer;

/**
 * @author weijiangquan
 * @date 2022/4/17 -0:50
 *
 *
 *
 * 可变个数形参方法
 *
 *  1.JDK 5.0新增
 *  2.具体使用
 *      2.1 可变个数形参的格式 数据类型...变量名
 *      2.2 当调用可变个数形参的方法时 传入个数可以是[0,多个)
 *      2.3 优先考虑的是不可变参数的(注意)
 *      2.4 可变个数形参的方法名与本类中的方法名相同,形参不同的方法之间构成重载
 *      2.4 和数组之间不能共存(见下面的例子)---这个比数组更方便
 *      2.5 可变要放在参数的最后面
 *      2.6 可变个数形参在方法形参中,最多只能声明一个可变形参
 */
public class OverloadExer{
    public static void main(String[] args) {
        OverloadExer test = new OverloadExer();
        test.show(12);
        test.show("hello"); //run result=>show(String)
        test.show("hello","heslajk");
        test.show();
    }

    public void show(int i){

    }
    public void show(String s){
        System.out.println("show(String)");
    }

    public void show(String ... strs){
        System.out.println("show(String ... strs)");
        /*for (int i = 0;i<strs.length;i++){
            System.out.println(strs[i]);
        }*/

        // 和上面for循环等价
        for (String str : strs) {
            System.out.println(str);
        }
    }
    // 下面会报错
    /*public void show(String ... strs,int a){

    }*/

    // 和上面不能共存
   /* public void show(String[] strs){

    }*/


}
