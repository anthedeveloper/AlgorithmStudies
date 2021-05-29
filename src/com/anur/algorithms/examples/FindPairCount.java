package com.anur.algorithms.examples;

import java.util.*;

/**
 * @author aysenurulu
 */
public class FindPairCount {
    /**
     *
     * @param ar array of int
     * @return number of pairs
     */
    public static int findPairCount( int[] ar) {
        HashMap<Integer, Integer> list = new HashMap<>();
        int pair = 0;
        for(int i = 0; i< ar.length; i++) {
            if (list.containsKey(ar[i])) {
                list.put(ar[i],list.get(ar[i]) + 1);
            } else {
                list.put(ar[i], 1);
            }
        }
        for(int i: list.values()){
            pair += i/2;
        }
        return pair;
    }

}
