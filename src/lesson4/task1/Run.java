package lesson4.task1;

import java.util.ArrayList;

public class Run {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("USA");
        list.add("Russia");
        list.add("France");

        list.set(1, "Sweden");
        list.remove(1);
        list.remove("France");
        list.indexOf("USA");
        System.out.println(list.contains("France"));

    }
}
