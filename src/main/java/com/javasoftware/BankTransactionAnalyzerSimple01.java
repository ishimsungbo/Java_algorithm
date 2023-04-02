package com.javasoftware;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

//1월 입출금 내역 합계 계산하기
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
/**
 2.4.1 - final 변수
 예제 코드에서 사용한 final 키워드를 알아보자
 지역 변수나 필드를 final로 정의하기 때문에 이 변수에 값을 재할당할 수 없다.
 final 사용에 따른 장단점이 모두 있다.
 코드에서 가능한 많은 변수를 final로 표시하면 어떤 객체의 상태가 바뀔 수 있고,어떤 객체의 상태를 바꿀 수 없는지 명확하게
 구분할 수 있다.

 2.5
 코드 유지보수성과 안티 패턴
 코드를 구현할 때는 코드 유지보수성을 높이기 위해 노력한다.
 무슨 의미일까?
 구현하는 코드가 가졌으면 하는 속성을 목록으로 만들어보자.

 1.특정 기능을 담당하는 코드를 쉽게 찾을 수 있어야 한다.
 2.코드가 어떤 일을 수행하는지 쉽게 이해할 수 있어야 한다.
 3.새로운 기능을 쉽게 추가하거나 기존 기능을 제거할 수 있어야 한다.
 4.캡슐화가 잘 되어 있어야 한다. 즉 코드 사용자에게는 세부 구현 내용이 감춰져 있으므로
  사용자가 쉽게 코드를 이해하고, 기능을 바꿀 수 있어야 한다.

 궁극적으로 개발자의 목표는 현재 만들고 있는 응용프로그램의 복잡성을 관리하는 것이다.
 하지만 새로운 요구 사항이 생길 때마다 복사, 붙여넣기로 이를 해결한다면 다음과 같은 문제가 생긴다.
 효과적이지 않은 해결 방법으로 잘 알려져 있으며, 안티패턴 anti-pattern 이라고 한다.

 1.한 개의 거대한 갓 클래스 때문에 코드를 이해하기가 어렵다.
 2.코드 중복 때문에 코드가 불안정하고 변화에 쉽게 망가진다.

 2.5.1 갓 클래스
  한 개의 파일에 모든 코드를 구현하다 보면 결국 하나의 거대한 클래스가 탄생하면서 클래스의
 목적이 무엇인지 이해하기 어려워진다. 거대한 클래스가 모든 일을 수행하기 때문이다.
  기존 코드의 로직을 갱신해야 한다면, 어떻게 이 코드를 찾아서 바꿀 수 있을까? 이런 문제를 갓 클래스 안티패턴 이라 부른다.
  한 클래스로 모든 것을 해결하는 패턴이다. 여러분은 이런 갓 클래스 안티 패턴이 나타나지 않도록 주의 해야 한다.
  이 패턴을 지양하고 우리는 "단일 책임 원칙" 을 지양한다.
 **/