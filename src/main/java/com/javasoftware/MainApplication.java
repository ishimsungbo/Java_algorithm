package com.javasoftware;

import java.io.IOException;

public class MainApplication {

    private static final String RESOURCES = "D:\\worskpace\\Java_algorithm\\src\\main\\resources\\ex.csv";

    public static void main(String[] args) throws IOException {

        final  BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();

        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        bankStatementAnalyzer.analyze(RESOURCES,bankStatementParser);

    }
}
