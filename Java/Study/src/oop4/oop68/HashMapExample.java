package oop4.oop68;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        // Map - словарь (ключ-значение)

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 4); // добавить или перезаписать ключ-значение
        hashMap.put("Petya", 3);
        hashMap.put("Michael", 5);
        System.out.println(hashMap);
        System.out.println(hashMap.get("John")); // получить значение по ключу
        System.out.println(hashMap.containsKey("Abrakadabra")); // возвращает true если такой ключ существует
        hashMap.putIfAbsent("Michael", 3); // добавить пару ключ-значение если ключ отсутствует
        System.out.println(hashMap);
        hashMap.put("Michael", 3); // перезаписать ключ-значение
        System.out.println(hashMap);
        hashMap.replace("Petya", 5); // заменить значение по ключу если такой ключ есть
        System.out.println(hashMap);
        hashMap.remove("John"); // удаляет значение по ключу если такой ключ есть
        System.out.println(hashMap);


    }
}
