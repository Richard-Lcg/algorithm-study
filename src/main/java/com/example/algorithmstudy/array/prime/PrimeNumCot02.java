package com.example.algorithmstudy.array.prime;

/**
 * @author licangui
 * @date 2026/5/17 20:43
 * @Description 查找素数个数-埃筛法
 */
public class PrimeNumCot02 {

    public static int primeCount(int x){
        int count = 0;
        for(int i = 2; i < x; i++){
            count += isPrime(i) ? 1:0;
        }
        return count;
    }
    public static boolean isPrime(int x){
        for(int i = 2; i < x ; i ++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeCount(100));
    }

}

