package com.anur.algorithms;

import com.anur.algorithms.edu.BubbleSort;
import com.anur.algorithms.edu.EuclidAlgorithm;
import com.anur.algorithms.edu.SelectionSort;
import com.anur.algorithms.examples.BinaryRepMaxConsecutiveOnes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        System.out.println(BinaryRepMaxConsecutiveOnes.findConsecutiveOnes(439));
//        System.out.println(EuclidAlgorithm.computeGcd(12,8));
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(0);
        list.add(9);
        list.add(4);
        list.add(7);
        list.add(5);
        System.out.println(list);
        SelectionSort.sort(list);
        System.out.println(list);
    }
}
