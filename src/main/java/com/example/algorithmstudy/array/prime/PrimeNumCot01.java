package com.example.algorithmstudy.array.prime;

/**
 * @author licangui
 * @date 2026/5/17 20:43
 * @Description 查找素数个数-BF
 */
public class PrimeNumCot01 {
    public static int primeCount(int x){
        int count =0;
        boolean[] isPrime = new boolean[x];
        for (int i = 2; i < x; i++){
            if(!isPrime[i]){
                count++;
                for(int j = i * i;  j < x; j+=i){
                    isPrime[j] = true;
                }
            };
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(primeCount(100));
    }

}

