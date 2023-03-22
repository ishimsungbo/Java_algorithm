package com.modernJava;

import java.util.function.Supplier;

public class SupplierExample {

    public static String executeSupplier(Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        System.out.println(
            SupplierExample.executeSupplier(() -> {
                System.out.println("DataBase에서 자료를 가져옴");
                return "부산 지역 100개 매장의 매출 리스트를 리턴";
            }));
    }
}


/**
 * 제공되는 함수형 메서드를 살펴보면 이름은 get이며 입력 파라미터는 없고 리턴 타입만 존재한다.
 * 입력 없이 출력만 있어서 공급자(Supplier)라는 이름을 사용했고, 메서드명도 직관적이다.
 * 파라미터 없이 리턴 타입만 있는 메서드로 주로 지정된 정보를 확인하거나 조회할 때 유용하다.
 * @param supplier
 * @return
 */