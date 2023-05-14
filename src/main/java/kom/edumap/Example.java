package kom.edumap;

import java.util.HashMap;
import java.util.Map;

/*
HashMap의 모든 key 또는 value들의 합계와 평균을 계산하는 방법을 소개합니다.
아래와 같이 for문을 이용하여 Map의 모든 value들을 순회하면서 합계를 계산할 수 있습니다. 평균은 합계를 HashMap의 size로 나누면 됩니다.
*/
public class Example {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 13);
        map.put("B", 26);
        map.put("C", 30);

        int sum = 0;
        for(int value:map.values()){
            sum += value;
        }
        System.out.println("sum : " + sum);

        double avg = sum / map.size();
        System.out.println("avg : " + avg);
    }

}
