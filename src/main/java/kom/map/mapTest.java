package kom.map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class mapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> search = new HashMap<>();
        search.put("param1","1001");
        search.put("param2","가나다라");
        search.put("param3","서울");

        map.put("dlt_Search",search);
        System.out.println(map.toString());

        System.out.println(map.keySet());
        Object[] keys = map.keySet().toArray();
        System.out.println(keys[0]);
        System.out.println("------------");
        Map<String, Object> map01 = new HashMap<>();
        //map01 = map.entrySet().stream().map();

    }
}
