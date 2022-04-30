package secondDay;

/**
 * @author weijiangquan
 * @date 2022/4/30 -11:14
 * @Description
 */
public class ValueTransferTest_3_1 {
    public static void main(String[] args) {

        // 交换变量
        int m = 10;
        int n = 20;
        ValueTransferTest_3_1 test_3_1 = new ValueTransferTest_3_1();
        test_3_1.swap(m,n); //这个时候不会改变值(传进去的只是数据)
        System.out.println("m="+m+",n="+n); //run result=>m=10,n=20
    }
    /**
     * 交换两个变量的值操作
     * @param m
     * @param n
     */
    public void swap(int m,int n){
        int temp  = m;
        m = n;
        n = temp;
    }
}

