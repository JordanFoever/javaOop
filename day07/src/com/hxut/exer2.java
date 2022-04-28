package com.hxut;

/**
 * @author weijiangquan
 * @date 2022/4/28 -15:32
 */

interface Filial{ //孝顺的
    default void help(){
        System.out.println("老妈,我来救你了");
    }
}
interface Spoony{ //痴情的
    default void help(){
        System.out.println("救老婆");
    }
}
class Father{
    public void help(){
        System.out.println("救我媳妇");
    }
}
 class Man extends Father implements Filial,Spoony{
     @Override
     public void help() {
         super.help();
         Filial.super.help(); //救它妈
         Spoony.super.help();  //救它媳妇
     }
 }
