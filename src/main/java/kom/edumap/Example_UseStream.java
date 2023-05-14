package kom.edumap;

import java.util.HashMap;
import java.util.Map;

public class Example_UseStream {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 13);
        map.put("B", 26);
        map.put("C", 30);

        int sum = map.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum : " + sum);

        double avg = sum / map.size();
        System.out.println("avg : " + avg);
    }
}
