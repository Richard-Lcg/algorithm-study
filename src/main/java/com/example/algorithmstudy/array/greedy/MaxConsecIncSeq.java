package com.example.algorithmstudy.array.greedy;

/**
 * @author licangui
 * @date 2026/5/30 12:19
 * @Description 最大连续递增序列
 */
public class MaxConsecIncSeq {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,2,1,2,3,4,5};
        System.out.println(tx(arr));
    }

    private static int tx(int[] arr) {
        int start = 0;
        int max = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] <= arr[i-1]){
                start = i;
            }
            max = Math.max(max, i -start+1);
        }
        return max;
    }
}
