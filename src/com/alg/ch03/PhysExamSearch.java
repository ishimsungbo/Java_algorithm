package com.alg.ch03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Arrays.binarySearch 표준 라이브러리를 이용해 이진검색을 사용

public class PhysExamSearch {

    static class PhyscData{
        private String name;    // 이름
        private int height;     // 키
        private double vision;  // 시력

        // 생성자
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new heightOderComparator();

        private static class heightOderComparator implements Comparator<PhyscData>{
            @Override
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdInt = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("이나령",162, 0.3),
                new PhyscData("유지훈",168, 0.4),
                new PhyscData("김한결",169, 0.8),
                new PhyscData("홍준기",171, 1.5),
                new PhyscData("진서현",173, 0.7),
                new PhyscData("이호현",174, 1.2),
                new PhyscData("이호현",175, 2.0)
        };

        System.out.println("몇 cm인 사람을 찾고 있나요?");
        int height = stdInt.nextInt();
        int idx = Arrays.binarySearch(x,new PhyscData("",height,0.0), PhyscData.HEIGHT_ORDER);

        if(idx < 0){
            System.out.println("요소가 없습니다");
        }else{
            System.out.println("x["+idx+"] 에 있습니다");
            System.out.println("찾은 데이터 : x["+idx+"]");
        }

    }
}
