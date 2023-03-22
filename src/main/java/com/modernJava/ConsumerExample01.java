package com.modernJava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample01 {

    // Consumer 는 받기만하고 리턴하지 않아서 소비자라는 이름을 사용한다.

    public static void executeConsumer(List<String> nameList, Consumer<String> consumer){
        for(String name : nameList){
            //메서드의 두번째 인수로 전달된 람다 표현식을 실행시킨다.
            consumer.accept(name);
        }
    }

    public static void executeUserConsumer(List<User> users, Consumer<User> conUser){
        // users 를 받아서 어떤 일을 하는 메서드를 만든다.
        for(User user : users){
            conUser.accept(user);
        }
    }

    // Consumer 인터페이스의 활용예제
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("정수빈");
        nameList.add("문동은");
        nameList.add("박연진");
        nameList.add("오재원");

        ConsumerExample01.executeConsumer(nameList, name ->
        {
            int i = 10;
            System.out.println("메일을 보냈습니다."+ name);
        }
        );

        List<User> users = new ArrayList<>();
        for(int i=0; i < 10 ;i++){
            User user = new User("이름"+i,"addr"+i);
            users.add(user);
        }

        executeUserConsumer(users, user->System.out.println(user));
    }

}

class User{
    private String name;
    private String addr;

    public User(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}