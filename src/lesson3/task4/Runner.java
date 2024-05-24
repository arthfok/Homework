package lesson3.task4;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(duplicateChar(str));
    }

    public static String duplicateChar(String s) {
        char[] ch = s.toCharArray();
        StringBuilder word = new StringBuilder();

        for (char element : ch) {
            word.append(element).append(element);
        }

        return word.toString();
    }
}
