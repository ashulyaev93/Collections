package homework3;

import java.util.*;

public class Main {

    public static void main(String[] args){

        ArrayList<String> word = new ArrayList<>(Arrays.asList("Cтул", "Cтол", "Cтол", "Компьютер", "Блокнот", "Ручка",
                "Лампа", "Бумага", "Ручка", "Карандаш", "Блокнот", "Окно", "Дверь", "Тапочки"));

        Map<String, Integer> wordMap = new HashMap<String, Integer>();//создаём пустой Map;

        for (String string : word) { //заполняем ключи

            if(wordMap.keySet().contains(string)) { //вызываем все ключи содержащиеся в массиве;
                wordMap.put(string, wordMap.get(string) + 1); // если уже есть ключ, то прибавляем единицу;
            } else {
                wordMap.put(string, 1);// если нет, то кладем ключ и присваиваем значение 1;
            }
        }

        System.out.println(wordMap.keySet());
        System.out.println(wordMap);
    }
}


