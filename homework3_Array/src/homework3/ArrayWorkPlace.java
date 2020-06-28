package homework3;

import java.util.*;

public class ArrayWorkPlace {
    public static void getArray(){

        ArrayList<String> word = new ArrayList<>(Arrays.asList("Cтул", "Cтол", "Cтол", "Компьютер", "Блокнот", "Ручка",
                "Лампа", "Бумага", "Ручка", "Карандаш", "Блокнот", "Окно", "Дверь", "Тапочки"));

        //Вывод только уникальных слов;
        Map<String, Integer> workPlace = countWords(word);

        for (Map.Entry<String, Integer> pair : workPlace.entrySet()) {
            System.out.print(pair.getKey() + " ");
        }

        System.out.println(" ");
        System.out.println(" ");

        //Вывод колличества дублей каждого слова;
        for (Map.Entry<String, Integer> pair : workPlace.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<>();

        for (String s : list) {
            result.put(s, Collections.frequency(list, s));
        }
        return result;
    }
}
