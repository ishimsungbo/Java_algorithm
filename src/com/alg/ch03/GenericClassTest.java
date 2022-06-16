package com.alg.ch03;

//그냥 제네릭 한번 만들어 보자
public class GenericClassTest {
    
    static class GenericClass<T>{
        private T xyz;

        public GenericClass(T xyz) {
            this.xyz = xyz;
        }

        public T getXyz() {
            return xyz;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> s = new GenericClass<String>("ABC");
        GenericClass<Integer> n = new GenericClass<Integer>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}
