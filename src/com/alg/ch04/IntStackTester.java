package com.alg.ch04;

import java.util.Scanner;

// int 형  스택의 사용예
public class IntStackTester {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while (true){
            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("");
            System.out.println("");
            System.out.println("현재 데이터 수 : " + s.size()+" / "+ s.capacity());
            System.out.print("(1)푸쉬  (2)팝  (3)피크  (4)덤프    (0)종료  :  ");

            int menu = stdIn.nextInt();
            if(menu ==0) break;

            int x;
            switch (menu){
                case 1:   //푸쉬
                    System.out.print("푸쉬 데이터 : ");
                    x = stdIn.nextInt();
                    try{
                        s.push(x);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("스택이 가득 찼습니다");
                    }
                break;

                case 2: //팝
                 try{
                    x = s.pop();
                    System.out.println("Pop 한 데이터는 "+ x +" 입니다.");
                 }catch (IntStack.EmptyIntStackException e){
                     System.out.println("스택이 비어 있습니다");
                 }
                 break;

                case 3:
                    try{
                        x = s.peek();
                        System.out.println("피크한 데이터는 "+ x +" 입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있습니다");
                    }
                break;

                case 4:
                    s.dump();
                    break;
            }
        }

    }
}
