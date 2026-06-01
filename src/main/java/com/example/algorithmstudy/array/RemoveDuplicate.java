package com.example.algorithmstudy.array;

/**
 * @author licangui
 * @date 2026/5/27 15:12
 * @Description 删除重复值,获取最终数组长度
 */
public class RemoveDuplicate {


    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4,5,7,7,8};
        System.out.println(rd(arr));
    }

    private static int rd(int[] arr) {
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
