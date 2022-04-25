package com.hxut13.exer1;

/**
 * @author weijiangquan
 * @date 2022/4/25 -18:32
 */
public class GeometricObject {  //几何图形

    protected  java.lang.String color;
    protected  double weight;


    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * 求面积
     * @return
     *
     * 我有一个疑问，这个方法子类自己要重写的(没有子类会用到父类的方法)，都用不到父类的，父类还有必要写这个方法吗?
     * 想明白了:有必要，而且必须要写，因为对于多态来说，通过父类的引用指向不同的子类的时候，
     *  子类必须重写了父类的方法，才可以调用不同子类重写之后的方法
     *
     *  所以这里返回0.0似乎毫无意义
     */
    public double findArea(){
        return 0.0;
    }


}
