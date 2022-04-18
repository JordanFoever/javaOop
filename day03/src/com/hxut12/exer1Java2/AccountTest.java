package com.hxut12.exer1Java2;

/**
 * @author weijiangquan
 * @date 2022/4/18 -20:54
 *
 *
 *
 */
public class AccountTest{
    public static void main(String[] args) {
        Account account = new Account(1222,20000,0.045);
        account.withDraw(3000);
        System.out.println("你的账户余额为"+account.getBalance());
        account.withDraw(30000);
        System.out.println("您的账户余额为"+account.getBalance());
        account.deposit(3000);
        System.out.println("您的账户余额为"+account.getBalance());

        System.out.println("月利率为"+(account.getMonthlyInterest()*100)+"%");
    }
}
