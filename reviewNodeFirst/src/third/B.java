package third;

import org.junit.Test;

/**
 * @author weijiangquan
 * @date 2022/4/30 -12:32
 * @Description
 */

class A{
    public static void eat(){
        System.out.println("A吃饭");
    }
}
public class B extends A{
    public static void eat() { //报错喜
        System.out.println("B吃饭");
    }
    @Test
    public void test(){
        A.eat();//run result=>A吃饭
        B.eat();//run result=>B吃饭
    }
}
