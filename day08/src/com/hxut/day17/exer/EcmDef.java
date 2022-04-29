package com.hxut.day17.exer;

/**
 * @author weijiangquan
 * @date 2022/4/29 -16:52
 *  如果定义的是非运行时的异常,我们就要将其进行抛出
 *
 *  像运行时的异常一般情况下是可以不用处理的
 *
 */
public class EcmDef{
    public static void main(String[] args){
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            int result = ecm(i, j);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("数据类型不一致");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e){
            System.out.println("除0");
        }catch (EcDef e){
            System.out.println(e.getMessage());
        }
    }

    public static int ecm(int i,int j) throws EcDef {
        if(i<0||j<0){
            throw new EcDef("分子或分母为负数了");
        }
        return i/j;
    }
}

// 自定以的异常
class EcDef extends Exception{
    static final long serialVersionUID = -3387516193124229948L; //把数字稍微改一下就行了

    public EcDef() {
    }

    public EcDef(String message) {
        super(message);
    }
}



