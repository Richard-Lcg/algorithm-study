package com.example.algorithmstudy;

/**
 * @author licangui
 * @date 2026/6/1 15:17
 * @Description
 * 总共有n枚硬币，将它们摆成一个阶梯形状，第k行就必须正好有k 枚硬币
 * 给定一个数字n，找出可形成【完整阶梯行的总行数】。
 * n是一个非负整数，并且在32位有符号整型的范围内
 */
public class CoinArrangeRow {
    public static void main(String[] args) {
        System.out.println(rows2(1));
    }

    /**
     * 普通遍历
     * @param n  传入的硬币总数
     * @return   完整阶梯行数
     */
    private static int rows1(int n) {
        for (int i = 1; i <= n; i++) {
            n = n -i;
//          重点：这里判断减完当前行的币数后，最多只能再排列当前行，也就是肯定排不满下一行
            if(n <= i){
                return i;
            }
        }
        return 0;
    }

    /**
     * 二分查找法
     * @param n
     * @return
     */
    private static int rows2(int n) {
        int low = 1;
        int high = n;
        int mid =0;
        for (int i = low; i <= high; i++) {
            mid = (high - low)/2 + low;
//          行数=中间数时的总币数
            int cot = (mid + 1) * mid / 2;
            if(cot > n){
                high = mid;
            }else{
                low =mid;
            }
        }
        return mid;
    }
    private static int rows3(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
//          行数=中间数时的总币数
            int cot = (mid + 1) * mid / 2;
            if (cot == mid){
                return mid;
            }else if(cot > n){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return high;
    }
}


