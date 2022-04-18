package com.hxut12.exer;

/**
 * @author weijiangquan
 * @date 2022/4/18 -16:21
 */
public class MankKind {

    private int sex;
    private int salary;

    public MankKind() {

    }

    public MankKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manWoman(){
        if(sex == 1){
            System.out.println("man");
        }else if (sex == 0){
            System.out.println("woman");
        }
    }

    public void emloyeed(){
        String jobInfo = (salary == 0)?"no job":"job";
        System.out.println(jobInfo);
    }
}
