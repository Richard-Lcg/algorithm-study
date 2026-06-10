package com.example.algorithmstudy;

/**
 * @author licangui
 * @date 2026/6/10 15:23
 * @Description 打印如下图形：
 *
 *
         *************
         **    *   * *
         * *   *  *  *
         *  *  * *   *
         *   * **    *
         *    **     *
         *************
         *    ***    *
         *   * * *   *
         *  *  *  *  *
         * *   *   * *
         **    *    **
         *************
 */
public class PrintGraphics {
    public static void main(String[] args) {
        int[] arr = new int[13];
        int length = arr.length;
        int mid = length / 2 + 1;
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if(i == 1 || i == mid || i == length){
                    System.out.print("*");
                }else{
                    if(i < mid){
                        if(j == 1 || j == length || j == i || j == length-i || j == mid){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }else{
                        if(j == 1 || j == length || j == mid -(i -mid) || j == mid + (i -mid) || j == mid){
                             System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
