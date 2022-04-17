package com.hxut09.exer;

/**
 * @author weijiangquan
 * @date 2022/4/17 -11:53
 * 定义一个整型的数组int型:int[] arr = new int[]{12,3,3,34,56,77,432};
 * 让数组的每个位置的值去除以首位置的元素,得到结果,作为该位置上的新值.遍历新的数组
 */
public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{12,3,3,34,56,77,432};

        /*// 方法一
        for(int i = arr.length-1;i>0;i--){
            arr[i] = arr[i]/arr[0];
        }*/

        // 方法二
        int temp = arr[0];
        for(int i =0;i<arr.length;i++){
            arr[i]=arr[i]/temp;
        }

    }
}

