package homework3_Directory;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        PhoneDictionary a = new PhoneDictionary();
        //Добавление нового контакта
        a.add("Васин", new ArrayList<>(Arrays.asList("89277488349")));
        a.getTelBook();
//Поиск по фамилии
        a.get("Шуляев");
        System.out.println(a.get("Шуляев"));
    }
}
