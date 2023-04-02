package com.javasoftware;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

// 2-8 BankStatementAnalyzer 클래스를 이용해 입출금 내역 목록 처리
public class BankStatementAnalyzer {

    private static final String RESOURCES = "D:\\worskpace\\Java_algorithm\\src\\main\\resources\\ex.csv";

    public static void main(String[] args) throws IOException {
        final BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();

        final Path path = Paths.get(RESOURCES);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatementCSVParser.parseLinesFromCSV(lines);

        //응집도 파트 적용 시작 부분
        final BankStatementProcessor processor = new BankStatementProcessor(bankTransactions);
        collectSummary(processor);
    }

    private static void collectSummary(final BankStatementProcessor bankStatementProcessor){
        System.out.println("총 트랜잭션 금액 : " + bankStatementProcessor.calculateTotalAmount());
        System.out.println("총 1월 발생 금액 : " + bankStatementProcessor.calculateTotalMonth(Month.JANUARY));
        System.out.println("총 2월 발생 금액 : " + bankStatementProcessor.calculateTotalMonth(Month.FEBRUARY));
        System.out.println("총 받은(salary 카테고리) 금액 : " + bankStatementProcessor.calculateTotalForCategory("Salary"));
    }
}
