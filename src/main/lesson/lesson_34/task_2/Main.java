package main.lesson.lesson_34.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userString = reader.readLine();
        Integer k = Integer.parseInt(reader.readLine());
        String[] words = userString.split(" ");
        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> wordCount = new TreeMap<>();

        for(int i = 0; i < words.length; i++){
            map.put(i, words[i]);
        }

        for(int i = 0; i < words.length;i++){
            int count = 0;
            for(int j = 0; j < words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                }
            }
            wordCount.put(words[i], count);
        }
        System.out.println(wordCount);

        reader.close();
    }
    public static TreeMap<Integer, String> method(Integer numbers, String[] array){
        HashMap<String, Integer> map = new HashMap<>();

        for(String str : array){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        Map<String, Integer> map1 = new TreeMap<>();



//        for(int i = 0; i < array.length; i++){
//            map.put(i, array[i]);
//        }
//
//        Map<String, Integer> map1 = new TreeMap<>();
//        for(int i = 0; i < map.size();i++){
//            int count = 0;
//            for(int j = 0; j < map.size();j++){
//                if(map.get(i).equals(map.get(j))){
//                    count++;
//                }
//            }
//
//            if(count >= numbers)
//                map1.put(map.get(i), count);
//        }
//
//        System.out.println();


        return null;
    }

}
