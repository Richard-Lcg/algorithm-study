package com.example.algorithmstudy.array.sumoftwonum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author licangui
 * @date 2026/5/31 21:04
 * @Description 通过Map方法解决两数之和
 */
public class ByMap {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,7,4,13};
        int[] res = ts(arr,16);
        System.out.println(Arrays.toString(res));
    }

    private static int[] ts(int[] arr, int target) {
        HashMap hashMap = new HashMap();
        for (int i :arr) {
            if(hashMap.containsKey(target - i)){
                return new int[]{i,target -i};
            }else{
                if(!hashMap.containsKey(i)){
                    hashMap.put(i,i);
                }
            }
        }
        return new int[]{0};
    }
}
