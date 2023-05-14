package kom.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Test01 {
    public static void main(String[] args) {

        System.out.println(Dish.menu.toString());

        List<String> dishNames = Dish.menu.stream()
                .map(Dish::getName) //리스트 형태를 문자로
                .collect(toList());

        System.out.println(dishNames.toString());

        List<Integer> dishNamesLength = Dish.menu.stream()
                .map(Dish::getName)
                .map(String::length)  //리스트형태를 숫자로
                .collect(toList());

        System.out.println(dishNamesLength.toString());

        List<String> words = Arrays.asList("Modern","Java","In","Action");
        List<Integer> wordLength = words.stream()
                .map(String::length)
                .collect(toList());

        System.out.println(wordLength.toString());

        //스트림 평면화
        List<String> words2 = Arrays.asList("Hello", "World");
        List<String> result01 = words2.stream()
                .flatMap((String line) -> Arrays.stream(line.split("")))
                .distinct()
                .collect(toList());
        System.out.println(result01.toString());
    }
}
