package homework3_Directory;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        PhoneDictionary a = new PhoneDictionary();
        a.getTelBook();
        //Добавление нового контакта
        a.add("Шуляев", "89277488349");


        System.out.println(" ");

        //Поиск по фамилии
        System.out.println("Поиск: Шуляев: " + a.get("Шуляев"));
    }
}
