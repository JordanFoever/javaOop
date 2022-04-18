package com.hxut10.exer4;

/**
 * @author weijiangquan
 * @date 2022/4/18 -0:31
 *
 * 对象数组(银行相关的相对于上一个例子更复杂一点)
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("jane","Smith");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withDraw(500);
        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户"+bank.getCustomer(0).getFirstName()+"账户余额为:"+balance);

        System.out.println("****************************");
        bank.addCustomer("万里","杨");

        System.out.println("银行各户的个数为"+bank.getNumOfCustomers());
    }

}


喜欢即使一个

