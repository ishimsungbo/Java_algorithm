package com.modernJava;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

    public static MethodReference of(){
        return new MethodReference();
    }

    // 데이터 처리 로직 정의
    public static void executeMethod(String entity){
        if(entity != null && !"".equals(entity)){
            System.out.println("Content : " + entity);
            System.out.println("Length : " + entity.length());
        }
    }

    //대문자로 변경하는 코드
    public void toUpperCase(String entity){
        System.out.println(entity.toUpperCase());
    }

    //실행 예
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        //1. 정적 메서드 참조
        list.stream().forEach(MethodReference::executeMethod);
        System.out.println("========================================");

        //2. 한정적 메서드 참조
        list.stream().forEach(MethodReference.of()::toUpperCase);

        System.out.println("========================================");
        //3.비한정적 메서드 참조
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }

}
