package com.example.algorithmstudy.array;

import java.util.Arrays;

/**
 * @author licangui
 * @date 2026/6/3 13:22
 * @Description
 * 给定一个整数数组 nums，请编写一个能够返回数组“中心下标” 的方法。
 * 中心下标是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和如果数组不存在中心下标，返回-1。如果数组有多个中心下标，应该返回最靠近左边的那一个。
 *
 * 注意:中心下标可能出现在数组的两端
 */
public class CentralIndex {

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,7,6,4,7};
        System.out.println(ci2(arr));
    }
    /*
    *  双指针
    * */
    private static int ci1(int[] arr) {
        int total = 0;
        int sum = Arrays.stream(arr).sum();
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if(sum == total){
                return i;
            }
            sum -= arr[i];
        }
        return -1;
    }

    /*
    *    总数 = 2倍的total + 中心值
    * */

    private static int ci2(int[] arr) {
        int total = 0;
        int sum = Arrays.stream(arr).sum();
        for (int i = 0; i < arr.length; i++) {
            if(sum == 2 * total + arr[i]){
                return i;
            }
            total += arr[i];
        }
        return -1;
    }

}
