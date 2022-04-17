package com.hxut10.exer3;

/**
 * @author weijiangquan
 * @date 2022/4/17 -21:55
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account; //定义引入类型 (情感上接收一下)想象成String类型就可以了


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}


