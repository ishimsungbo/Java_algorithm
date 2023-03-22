package com.modernJava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void executeConsumer(List<String> workList, Consumer<String> consumer){
        for(String work : workList){
            consumer.accept(work);
        }
    }

    public static void main(String[] args) {
        List<String> workList = new ArrayList<>();
        workList.add("서울 지역의 매출을 집계한다.");
        workList.add("부산 지역의 매출을 집계한다.");
        workList.add("서울과 부산 지점에 메일을 보낸다");
        ConsumerExample.executeConsumer(workList, work -> {
            System.out.println(work);
        });
    }
}
