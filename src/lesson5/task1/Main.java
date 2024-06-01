package lesson5.task1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(13, 45, 13, 22, 10, 78, 23, 64);

        List<Integer> newIntegerList = integerList.stream()
                .distinct()
                .filter(x -> x % 2 == 0)
                .toList();

        System.out.println(newIntegerList);
    }
}
