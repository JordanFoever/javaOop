package com.hxut13.exer;

/**
 * @author weijiangquan
 * @date 2022/4/25 -17:45
 * 若子类重写了父类的方法，就意味着子类里定义的方法彻底覆盖了父类里同名的方法
 * 系统将不可能把父类里的方法转移到子类种。 （编译看左，运行看右边）
 *
 * 对于实例对象不存在这样的现象，即使子类里定义与父类完全相同的实例变量，这个实例变量不可能覆盖父类种的实例对象(编译运行看左边)
 *
 * 一道笔试题
 */


class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}


class Sub extends Base{
    int count =20;
    public void display(){
        System.out.println(this.count);
    }
}

public class FieldMethodTest {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count); //20
        s.display(); //20
        Base b = s;

        // == ,对于引用类型来讲，比较的是两个引用数据类型的地址值是否相等(重要)
        System.out.println(b==s); //true
        System.out.println("b"+b); //bcom.hxut13.exer.Sub@1b6d3586 (有一个小的疑问，这个地址是自己本身的地址，还是堆空间数据的地址)
        System.out.println("s"+s);  //scom.hxut13.exer.Sub@1b6d3586
        System.out.println(b.count); //10  属性编译和运行和都是看的左边
        b.display(); //20
    }
}



