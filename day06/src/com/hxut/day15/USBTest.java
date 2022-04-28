package com.hxut.day15;

/**
 * @author weijiangquan
 * @date 2022/4/27 -22:33\
 * 接口的使用
 *
 *
 *
 *
 */
public class USBTest {

}

interface USB{
    //定义了长,宽,最大最小的传输速度等


    void start();

    void stop();

}



class Flash implements USB {


    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }

}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}

