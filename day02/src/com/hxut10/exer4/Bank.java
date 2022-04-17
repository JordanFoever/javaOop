package com.hxut10.exer4;

/**
 * @author weijiangquan
 * @date 2022/4/18 -0:18
 */
public class Bank {

    private Customer[] customers; //存放多个用户的数组
    private int numberOfCustomers; //记录客户的个数
    public Bank(){
        customers = new Customer[10]; //创建一个数组
    }

    /**
     * 添加用户
     * @param f
     * @param l
     */
    public void addCustomer(String f,String l){
        Customer customer = new Customer(f,l);
        /*customers[numberOfCustomers] = customer;
        numberOfCustomers++;*/
        // 将上面的代码合并一下
        customers[numberOfCustomers++] = customer; //放在数组中
    }

    /**
     * 获取用户的个数
     * @return
     */
    public int getNumOfCustomers(){
        return numberOfCustomers;
    }

    /**
     * 获取指定位置上的客户
     * @param index
     * @return
     */
    public Customer getCustomer(int index){
        if(index>=0&&index<numberOfCustomers){
            return customers[index];
        }
        return null;
    }

}
