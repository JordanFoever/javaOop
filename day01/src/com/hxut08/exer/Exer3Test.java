package com.hxut08.exer;

/**
 * @author weijiangquan
 * @date 2022/4/16 -20:56
 */

public class Exer3Test{
    public static void main(String[] args) {
        Exer3Test test = new Exer3Test();
        // 3.1 测试
        // test.method();
        // 3.2 测试
      /*  int meth = test.method();
        System.out.println(meth); //run result=>80*/

        System.out.println(test.method(12,33));

    }

    /*public void method(){
        for (int i = 0;i<10;i++){
            for(int j=0;j<8;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/

    /*public int method(){
        for (int i = 0;i<10;i++){
            for(int j=0;j<8;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return 10*8;
    }*/

    // 3.3
    public int method(int m,int n){
        for (int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return m*n;
    }
}


