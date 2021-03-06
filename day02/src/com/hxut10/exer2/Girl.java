package com.hxut10.exer2;

/**
 * @author weijiangquan
 * @date 2022/4/17 -21:01
 *
 * p235(值得再看)
 */
public class Girl{

    private int age;
    private String name;


    public Girl() {

    }

    public Girl(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);
    }

    /**
     * 比较两个对象的大小
     * @param girl
     * @return 正数:当前对象大  负数:当前对象小   0 当前对象和形参对象相等
     */
    public int compare(Girl girl){
        /*if(this.age>girl.age){
            return 1;
        }else if(this.age<girl.age){
            return -1;
        }else {
            return 0;
        }*/
        // 简写
        return this.age - girl.age;

    }
}
