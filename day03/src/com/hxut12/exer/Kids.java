package com.hxut12.exer;

/**
 * @author weijiangquan
 * @date 2022/4/18 -17:05
 */
public class Kids extends MankKind{

    private int yearsOld;

    public Kids() {

    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("我"+yearsOld+"岁");
    }
}
