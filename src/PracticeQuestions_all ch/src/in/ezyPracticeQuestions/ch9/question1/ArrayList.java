package PracticeQuestions_all;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("printing the elements in the array list");

        for (Integer num : list) {
            System.out.print(" "+num);
        }
    }
}
