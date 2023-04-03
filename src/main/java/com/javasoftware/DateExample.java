package com.javasoftware;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExample {

    public static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
    }

}
