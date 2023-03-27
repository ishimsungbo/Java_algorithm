package com.javasoftware;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class BankTransactionAnalyzerSimple {

    /**
     * 콤마로 열분리
     * 금액 추출
     * 금액을 double 로 파싱
     *
     * 파일이 비어 있다면?
     * 데이터에 문제가 있어서 금액을 파싱하지 못 한다면?
     * 행의 데이터가 완벽하지 않다면?
     */

    private static final String RESOURCES = "D:\\worskpace\\Java_algorithm\\src\\main\\resources\\ex.csv";

    public static void main(String[] args) throws IOException {

        final Path path = Paths.get(RESOURCES);
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;
        for(final String line: lines){
            final String[] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            total += amount;
        }

        System.out.println("The Total for all transactions is "+ total);

    }
}
