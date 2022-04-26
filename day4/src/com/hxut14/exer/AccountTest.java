package com.hxut14.exer;

/**
 * @author weijiangquan
 * @date 2022/4/26 -18:25
 */
public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account();
        Account account1 = new Account("qwerty",2000);


        Account.setInterestRate(0.012);
        Account.setMinMoney(100);

        System.out.println(account);  //感觉重写toString方法真的太好了 好像这样只能查看,最后还是要通过get方法获取数据
        System.out.println(account1);

        System.out.println(Account.getInterestRate());

    }
}
