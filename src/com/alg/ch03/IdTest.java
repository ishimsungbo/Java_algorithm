package com.alg.ch03;

class Id{
    private static int counter = 0;  // 아이디를 몇개 부여 했는지 저장
    private int id;                  // 아이디

    // 생성자
    public Id() {
        this.id = ++counter;
    }

    // 아이디를 반환하는 메서드
    public int getId(){return id;}

    // counter를 반환하는 메서드
    public static int getCounter(){return counter;}
}

public class IdTest {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        // 인스턴스 메서드
        System.out.println("a의 아이디 : " + a.getId());
        System.out.println("b의 아이디 : " + b.getId());

        //클래스 메서드
        System.out.println("부여한 아이디의 갯수 : " + Id.getCounter());

    }
}
