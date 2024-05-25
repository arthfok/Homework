package lesson3.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    private static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());

        System.out.println(findLessThanAverageString());

    }

    public static int findAverageLength() {

        int sum = 0;

        for (String s : list) {
            sum += s.length();
        }

        return sum / list.size();
    }

    public static ArrayList<String> findLessThanAverageString() {

        ArrayList<String> avgList = new ArrayList<>();

        for (String s : list) {
            if (s.length() < findAverageLength()) {
                avgList.add(s + " длина:" + s.length());
            }
        }

        return avgList;
    }
}
