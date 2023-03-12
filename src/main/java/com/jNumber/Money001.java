package com.jNumber;

import java.math.BigDecimal;

public class Money001 {
    public static void main(String[] args) {

        BigDecimal cuttingAmt = new BigDecimal(5123);

        cuttingAmt = cuttingAmt.setScale(-1,BigDecimal.ROUND_FLOOR);
        System.out.println(cuttingAmt.intValue()); // 원단위 절삭

        cuttingAmt = cuttingAmt.setScale(-2,BigDecimal.ROUND_FLOOR);
        System.out.println(cuttingAmt.intValue()); // 십단위 절삭

        BigDecimal decimalAmt = new BigDecimal(0.07);
        System.out.println(decimalAmt);

        double i = 0.07;
        BigDecimal BillingAmt = new BigDecimal(20051);
        BigDecimal BillingAmt2 = new BigDecimal(1000);
        BigDecimal ii = new BigDecimal(i);
        System.out.println(i);

        // 20051의 금액을 원단위 절삭한다.
        System.out.println(BillingAmt.setScale(-1,BigDecimal.ROUND_FLOOR).intValue());

        // 1000 에 7%를 구하고 금액을 원단위 절삭한다.
        BillingAmt2 = BillingAmt2.multiply(ii);
        BillingAmt2 = BillingAmt2.setScale(-1,BigDecimal.ROUND_FLOOR);
        System.out.println(BillingAmt2.intValue());
    }
}
