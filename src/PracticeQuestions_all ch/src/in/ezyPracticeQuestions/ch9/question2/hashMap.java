package PracticeQuestions_all;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("apple",5);
        map.put("guava",5);
        map.put("banana",10);
        map.put("grapes",11);
        map.put("cherry",1);

        System.out.println("the values in the Hashmap are:");
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.printf("\nkey is : %s\n value is:%d ",entry.getKey(),entry.getValue());
        }
    }
}
