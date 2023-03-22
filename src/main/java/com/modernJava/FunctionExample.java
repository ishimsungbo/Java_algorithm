package com.modernJava;

import java.util.function.Function;

public class FunctionExample {

    public static double exeDoubleFunction(double manageAmt, Function<Double, Double> function){
        return function.apply(manageAmt);
    }

    public static void main(String[] args) {

        double result = FunctionExample01.exeDoubleFunction(10000, amt -> {
            double result01 = amt * 0.1;
            return result01;
        });

        System.out.println("10,000원의 10%는 : " + result);
    }
}
