package com.hxut.day15;

/**
 * @author weijiangquan
 * @date 2022/4/27 -22:33\
 * 这个例子可以很好的理解接口
 *
 * 接口的使用
 *  1.接口使用上也满足多态性
 *  2.接口实际上体现的是一种规范
 */
public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();

        // 根据开发情况进行选择(下面有四种)
        // 1.创建接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        com.transferData(flash);


        //2.创建了接口的非匿名实现类的匿名对象
        com.transferData(new Printer());


        //3.创建接口的匿名实现类的非匿名对象
        USB phone = new USB(){

            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        com.transferData(phone);

        System.out.println("****************");

        // 4.创建了接口的匿名实现类的匿名对象
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("mp3结束工作");
            }
        });




    }
}
class Computer{
    public void transferData(USB usb){ //USB usb = new Flash();
        usb.start();
        System.out.println("具体的传输数据的细节");
        usb.stop();
    }
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


