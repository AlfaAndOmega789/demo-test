package main.homework.homework_35;

import java.util.HashMap;
import java.util.Map;

public class WorkWithArray {
    public static void main(String[] args) {
        String[] array1 = new String[]{"a", "b", "a", "c", "b"};
        String[] array2 = new String[]{"c","b","d"};

        System.out.println(wordMultiple(array1));
        System.out.println(wordMultiple(array2));
    }

    public static Map<String, Boolean> wordMultiple(String[] array){
        Map<String, Boolean> mp = new HashMap<>();

        for(int i = 0; i < array.length;i++){
            int count = 0;
            for(int j = i; j < array.length;j++){
                if(array[i].equals(array[j])){
                    count++;
                    if(count >= 2){
                        mp.put(array[i], true);
                    }
                }
            }
        }

        return mp;
    }
}
