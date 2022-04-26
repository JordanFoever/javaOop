package com.hxut14.java2;

/**
 * @author weijiangquan
 * @date 2022/4/26 -21:19
 *
 * main()方法的使用说明
 *  1.main()方法作为程序的入口
 *  2.main()也是一个普通的静态方法
 *  3.main() 方法可以作为我们和控制台交互的方式(之前使用 Scanner)
 *
 *
 *
 */
public class MainTest {
    public static void main(String[] args) {
           
    }
}

class Main{
    public static void main(String[] args) {
        args = new String[100];
        for(int i =0;i<args.length;i++){
            args[i] ="args"+i;
            System.out.println();
        }
    }
}


