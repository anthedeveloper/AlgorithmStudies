package com.anur.algorithms;

import com.anur.algorithms.edu.BubbleSort;
import com.anur.algorithms.edu.EuclidAlgorithm;
import com.anur.algorithms.edu.SelectionSort;
import com.anur.algorithms.examples.BinaryRepMaxConsecutiveOnes;
import com.anur.algorithms.examples.Calculator;
import com.anur.algorithms.examples.FindPairCount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println(BinaryRepMaxConsecutiveOnes.findConsecutiveOnes(439));
//        System.out.println(EuclidAlgorithm.computeGcd(12,8));
//        System.out.println(SelectionSort.sort(generateArrayList()));
//        System.out.println(FindPairCount.findPairCount(generateArrayInt()));
        //System.out.println(Calculator.divisorSum(6));

        int n = 1000000007; //scan.nextInt();
        boolean isPrime = isPrime(n);

        if(isPrime){
            System.out.println("Prime "+ n);
        }else{
            System.out.println("Not prime " + n);
        }
    }

    static int base =2;

    static boolean isPrime(int i){
        if(i <= 1){
            return false;
        }
        if (i == base){
            return true;
        }
        if(i%base == 0){
            return false;
        }
        base ++;
        return isPrime(i);
    }

    private static List<Integer> generateArrayList() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(0);
        list.add(9);
        list.add(4);
        list.add(7);
        list.add(5);
        System.out.println(list);
        return list;
    }

    static int[] generateArrayInt(){
        int[] ar = {1,2,4,6,7,8,8};
        return ar;
    }



}
