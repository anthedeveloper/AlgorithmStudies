package com.anur.algorithms.examples;

/**
 * @author aysenurulu
 */
public class Calculator {
    /**
     *
     * @param n an integer to calculate its sum of divisors
     * @return sum of the divisors
     */
    public static int divisorSum(int n) {
        int sum = 0;
        for(int i = 1 ; i<n; i++){
            if(n%i==0)
            {
                System.out.println(i);
                sum+= i;
            }
        }
        return sum;
    }
}
