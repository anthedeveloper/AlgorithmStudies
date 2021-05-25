package com.anur.algorithms;

/**
 * @author aysenurulu
 */
public class BinaryRepMaxConsecutiveOnes {
    /**
     *
     * @param n - number to convert binary representation
     * @return the maximum consecutive 1s in the binary representation of the n
     * example n = 125, binary rep = 1111101, returns 5
     */
    public static int findConsecutiveOnes(int n){
        String s = Integer.toBinaryString(n);
        int max = 0;
        int tot = 0;
        for (char c : s.toCharArray()){
            if(c == '0'){
                if(tot> max)
                    max = tot;
                tot = 0;
            }else {
                tot++;
            }
        }
        if(tot> max) // if ends with consecutive 1s
            max = tot;
        return max;
    }
}
