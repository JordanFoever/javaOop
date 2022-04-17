package com.hxut10.exer3;

/**
 * @author weijiangquan
 * @date 2022/4/17 -23:53
 *
 *
 * /**
 *  * @author weijiangquan
 *  * @date 2022/4/17 -21:59
 *  * 题目要求测试程序
 *  * (1)创建一个Customer,名字叫Jane Smith,他有一个账号为1000,余额为2000元,年
 *  *   利率为1.23%的账户
 *  * (2) 对Jane Smith操作
 *  *
 *  * 存入100元,再取出960元,再取出2000元
 *  * 打印出Jane Smith的基本信息
 *  *
 *  * 成功存入 100.0
 *  * 成功取出 960.0
 *  * 余额不足:取款失败
 *  *  自己再写一遍
 */
public class CustormerTest_2 {
    public static void main(String[] args) {
        Customer customer = new Customer("wang","yu");
        Account account = new Account(1000,1000,0.0124);
        customer.setAccount(account);
        customer.getAccount().deposit(1213);
        customer.getAccount().withDraw(1231);
    }
}
