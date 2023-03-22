package com.modernJava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");


        List<String> list2 = new ArrayList<String>();
        list.stream().forEach(s -> list2.add(s));

        //이렇게 가능 consumer를 인자로 받음...
        list.stream().forEach(System.out::println);

    }
}
