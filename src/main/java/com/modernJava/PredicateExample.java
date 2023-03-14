package com.modernJava;

import java.util.function.Predicate;

public class PredicateExample {

    public static boolean isValid(String name, Predicate<String> predicate){
        return predicate.test(name);
    }

    /**
     * 메서드를 선언할 때 불 타입의 리턴이 필요한 경우는 상당히 많다.
     * 대표적으로 어떤 처리 후 성공 혹은 실패했는지를 확인하고 싶은 경우나 값에 대한 검증을 수행하는 등의
     * 작업을 들 수 있다.
     */

    public static void main(String[] args) {
        boolean isValid = PredicateExample.isValid("",name->!name.isEmpty());
        System.out.println(isValid);
    }
}
