package com.anur.algorithms.edu;

import java.util.List;

/**
 * @author aysenurulu
 */
public class InsertionSort {
    /**
     *
     * @param list to sort
     * @return sorted list
     * time complexity BigO(n^2)
     */
    public static List<Integer> sort(List<Integer> list) {

        for(int i= 0; i< list.size()-1; i++){
            int minIndex = i;
            for(int j = i+1; j < list.size(); j++){
                if(list.get(j)< list.get(minIndex)){
                    minIndex = j;

                }
            }
            int tempMin = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, tempMin);

        }

        return list;
    }
}
