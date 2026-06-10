package com.example.algorithmstudy.array;

/**
 * @author licangui
 * @date 2026/6/3 13:56
 * @Description 三个数的最大乘积
 *
 *  整型数组 nums在数组中找出由三个数字组成的最大乘积，并输出这个乘积。
 *  乘积不会越界
 *  重点考察:线性扫描
 *
 */
public class ThreeMaxMul {
    public static void main(String[] args) {
        System.out.println(getMaxMul(new int[]{1, 2, -3, 4, -5, 6}));
    }

    private static int getMaxMul(int[] ints) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for(int x: ints){
            if(x < min1){
                min2 = min1;
                min1 = x;
            }else if(x <min2){
                min2 = x;
            }

            if(x > max1){
                max3 = max2;
                max2 = max1;
                max1 = x;
            }else if(x > max2){
                max3 = x;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }

}
