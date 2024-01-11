package main.lesson.lesson_34.task_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Long, Double> cards = new HashMap<>();//1.1
        cards.put(11111L, 1111.1);//1.2
        cards.put(22222L, 2222.2);
        cards.put(33333L, 3333.3);
        cards.remove(11111L);//1.3
        cards.remove(22222L);

        System.out.println(cards.get(11111L));//1.4

        for(Long keys : cards.keySet()){//1.5
            System.out.println(keys);
        }
        for(Double value : cards.values()){//1.6
            System.out.println(value);
        }
        boolean someValue = cards.containsValue(1111.1);//1.7
        System.out.println(someValue);
        boolean someKey = cards.containsKey(22222L);
        System.out.println(someKey);
    }
}
