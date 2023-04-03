package com.javasoftware;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

//1월 입출금 내역 합계 계산하기
public class BankTransactionAnalyzerSimple02 {

    private static final String RESOURCES = "D:\\worskpace\\Java_algorithm\\src\\main\\resources\\ex.csv";

    public static void main(String[] args) throws IOException {

        final BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();

        final Path path = Paths.get(RESOURCES);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatementCSVParser.parserLinesFrom(lines);

        System.out.println("모든 지출 내역의 합 : " + calculateTotalAmount(bankTransactions));
        System.out.println("1월 의 지출 내역  : "+ selectInMonth(bankTransactions,Month.JANUARY));
    }

    public static double calculateTotalAmount(final List<BankTransaction> bankTransactions){
        double total = 0d;
        for(final BankTransaction bankTransaction : bankTransactions){
            total += bankTransaction.getAmount();
        }
        return total;
    }

    public static List<BankTransaction> selectInMonth(final List<BankTransaction> bankTransactions, final Month month){
        final List<BankTransaction> bankTransactionsMonth = new ArrayList<>();
        for(BankTransaction bankTransaction : bankTransactions){
            if(bankTransaction.getDate().getMonth() == month){
                bankTransactionsMonth.add(bankTransaction);
            }
        }
        return bankTransactionsMonth;
    }
}