package com.javasoftware;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class BankTransactionAnalyzerSimple01 {

    private static final String RESOURCES = "D:\\worskpace\\Java_algorithm\\src\\main\\resources\\ex.csv";

    public static void main(String[] args) throws IOException {

        final Path path = Paths.get(RESOURCES);
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;

        final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for(final String line: lines){
            final String[] columns = line.split(",");

            final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
            if(date.getMonth() == Month.JANUARY){
                final double amount = Double.parseDouble(columns[1]);
                System.out.println("상세 내역 : " + amount);
                total += amount;
            }
        }

        System.out.println("The Total for all transactions in January is "+ total);
    }
}
