package lesson4.task2;

import java.util.LinkedList;

public class Runner {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.addFirst("USA");
        list.addFirst("Finland");
        list.addLast("Spain");
        list.addLast("Italy");

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
