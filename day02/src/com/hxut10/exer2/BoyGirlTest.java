package com.hxut10.exer2;

/**
 * @author weijiangquan
 * @date 2022/4/17 -21:41
 */
public class BoyGirlTest {
    public static void main(String[] args) {

        Boy boy = new Boy("小王",21);
        boy.shout();

        Girl girl = new Girl("小李",18);
        girl.marry(boy);

        Girl girl1 = new Girl("小红",19);
        int compare = girl.compare(girl1);
        System.out.println(compare);
        if(compare>0){
            System.out.println(girl.getName()+"大");
        }else if(compare<0){
            System.out.println(girl1.getName()+"大");
        }else {
            System.out.println("一样大");
        }
    }
}


