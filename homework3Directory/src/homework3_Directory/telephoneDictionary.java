package homework3_Directory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class PhoneDictionary {

    HashMap<String, ArrayList<String>> book = new HashMap<String, ArrayList<String>>();

    public void getTelBook() {

        book.put("Шуляев", new ArrayList<>(Arrays.asList("89277799417")));
        book.put("Смирнов", new ArrayList<>(Arrays.asList("8927599684")));
        book.put("Иванов", new ArrayList<>(Arrays.asList("8902885043")));
        book.put("Сидоров", new ArrayList<>(Arrays.asList("8929884926", "8927006969")));
        book.put("Петров", new ArrayList<>(Arrays.asList("89270589604")));
        book.put("Александров", new ArrayList<>(Arrays.asList("89179503556", "89278849304")));
        book.put("Алексеев", new ArrayList<>(Arrays.asList("89026099650")));
        book.put("Дмитриев", new ArrayList<>(Arrays.asList("89278560389")));
        book.put("Машин", new ArrayList<>(Arrays.asList("89277699405")));

        for (Map.Entry<String, ArrayList<String>> bookMap : book.entrySet()) {
            System.out.println(bookMap.getKey() + ": " + bookMap.getValue());
        }
    }

    //Вводим в справочник новые контакты;
    public void add(String login, ArrayList<String> phones) {
        book.put(login, phones);
    }

    //Вызываем в справочнике нужный нам контакт;
    public ArrayList<String> get(String login){
        return book.get(login);
    }
}

