package main.homework.homework_35;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkWithArray {
    public static void main(String[] args) {
        String[] array1 = new String[]{"a", "b", "a", "c", "b"}; //task 1
        String[] array2 = new String[]{"c","b","d"};
        String[] array3 = new String[]{"c","c","c","c"};

        System.out.println(wordMultiple(array1));
        System.out.println(wordMultiple(array2));
        System.out.println(wordMultiple(array3));

        String[] array4 = new String[]{"code", "bug"}; //task 2
        String[] array5 = new String[]{"man", "moon", "main"};
        String[] array6 = new String[]{"man", "moon", "good", "night"};

        System.out.println(pairs(array4));
        System.out.println(pairs(array5));
        System.out.println(pairs(array6));

        String str = "()";
        System.out.println(checkString(str));
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

    public static Map<String, String> pairs(String[] array){
        Map<String, String> map = new HashMap<>();

        for(String str : array){
            char[] ch = str.toCharArray();
            map.put(ch[0] + " ", ch[ch.length - 1] + " ");
        }

        return map;
    }

    public static String checkString(String str){ // task 3(не работает) я делаю проверку на палендром, что не корректно
//        List<Character> list = new ArrayList<>();
//        char[] ch = str.toCharArray();
//        for(Character character : ch){
//            list.add(character);
//        }

        String result = "сбалансирована";
        if(str.isEmpty()){
            result = "пустая строка";
            return result;
        }

        if(str.length() % 2 != 0){
            result = "не сбалансирована";
            return result;
        }
        char[] ch = str.toCharArray();
        int j = ch.length - 1 ;

        for(int i = 0 ; i < ch.length; i++){

            if(ch[i] != ch[j]){
                result = "не сбалансирована";
            }
            --j;
        }

        return result;
    }
}
