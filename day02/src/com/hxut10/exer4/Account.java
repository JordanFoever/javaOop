package com.hxut10.exer4;

/**
 * @author weijiangquan
 * @date 2022/4/18 -0:11
 *
 * 综合练习2 p237
 *
 */
public class Account {

    private double balance;

    public Account(double init_balance){
        this.balance = init_balance;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 存钱
     * @param amt
     */
    public void deposit(double amt){
        if(amt>0){
            balance+=amt;
            System.out.println("存钱成功");
        }
    }

    public void withDraw(double amt){
        if(balance >=  amt){
            balance -= amt;
            System.out.println("取钱成功");
        }else {
            System.out.println("取钱失败,余额不足");
        }
    }
}
