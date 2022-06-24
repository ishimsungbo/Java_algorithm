package com.alg.ch04;

import java.util.Arrays;

public class ArrayStreamPrint {

    public static void main(String[] args) {

        int[] arry = {10,200,333,222,1,2,3};

        Arrays.stream(arry).sorted().forEach(s -> System.out.println(s));

    }
}
