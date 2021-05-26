package com.anur.algorithms.edu;

/**
 * Greatest Common Divisor
 */
public class EuclidAlgorithm {
    /**
     *
     * @param m number
     * @param n number
     * @return gcd
     *
     */
    public static int computeGcd(int m, int n){
        int max = 0;

        for(int i = 1; i <= n && i <= m ; i ++){
            if(m%i ==0 && n%i == 0){
                max = i;
            }
        }

        return max;
    }
}
