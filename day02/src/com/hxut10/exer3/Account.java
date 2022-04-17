package com.hxut10.exer3;

/**
 * @author weijiangquan
 * @date 2022/4/17 -21:48
 */
public class Account {
    private int id;  //账号
    private double balance;  //余额
    private double annualInterestRate; //年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }



    /**
     * 取钱
     * @param amount
     */
    public void withDraw(double amount){
        if(balance < amount){
            System.out.println("余额不足,取钱失败");
            return;
        }
        balance -= amount;
        System.out.println("取钱成功"+amount);
    }

    /**
     * 存钱
     * @param amount
     */
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("成功存入"+amount);
        }
    }
}
