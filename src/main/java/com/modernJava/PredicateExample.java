package com.modernJava;

import java.util.function.Predicate;

public class PredicateExample {

    public static boolean isValid(String name, Predicate<String> predicate){
        return predicate.test(name);
    }

    public static void main(String[] args) {
        boolean isValid = PredicateExample.isValid("",name->!name.isEmpty());
        System.out.println(isValid);
    }
}
