package lesson3.task3;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;
        String uniqueWord = null;

        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();

            if (uniqueWord == null) {
                uniqueWord = findUniqueCharWord(input);
            }
        }

        System.out.println(uniqueWord);

    }

    public static String findUniqueCharWord(String strings) {
        String[] words = strings.split(" ");

        for (String word : words) {
            if (isUnique(word)) {
                return word;
            }
        }

        return null;
    }

    public static boolean isUnique(String word) {
        char[] ch = word.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ch[i + 1]) {
                return false;
            }
        }

        return true;
    }

}
