package com.anur.algorithms.edu;

import java.util.List;

/**
 * @author aysenurulu
 */
public class BubbleSort {
    /**
     *
     * @param list to sort
     * @return sorted list
     * time complexity BigO(n^2)
     */
    public static List<Integer> sort(List<Integer> list){

        for(int i = 0; i< list.size()-1; i++){
            for(int j = 0; j<list.size()-i-1;j++){
                if(list.get(j) > list.get(j+1)){
                    int tempMin = list.get(j+1);
                    list.set(j + 1, list.get(j));
                    list.set(j , tempMin);
                }
            }
        }

        return list;
    }
}
