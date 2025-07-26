package PracticeQuestions_all;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        System.out.println("original list");
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);
        System.out.println("list with removed element");
        list.remove(1);
        System.out.println(list);

    }
}
