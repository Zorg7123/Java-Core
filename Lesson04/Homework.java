package Lesson04;

import  java.util.*;

// 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список
//    уникальных слов, из коорых состоит массив(дубликаты не считаем). Посчитать., сколькораз встречается каждое слово.
// 2. Написать простой класс "Телефонный Справочник", который хранит в себе список фамилий и телефонных номеров.
//    В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
//    искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов(в случае
//    однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

public class Homework {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "pet", "lock", "dock", "lock", "fox", "dock", "golf", "lock"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        phonebook pb = new phonebook();

        pb.add("Ivanov", "123");
        pb.add("Petrov", "456");
        pb.add("Petrov", "789");

        System.out.println(pb.get("Petrov"));
    }
}

