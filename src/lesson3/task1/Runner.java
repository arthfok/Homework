package lesson3.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Runner {

    private static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());

        System.out.println("Самая длинная строка: " + fingLongestString()
                + " Длина: " + fingLongestString().length() + " символа");
        System.out.println("Самая короткая строка: " + findShortestString()
                + " Длина: " + findShortestString().length() + " символа");
    }

    public static String fingLongestString() {
        return Collections.max(list, Comparator.comparing(String::length));
    }

    public static String findShortestString() {
        return Collections.min(list, Comparator.comparing(String::length));
    }
}
