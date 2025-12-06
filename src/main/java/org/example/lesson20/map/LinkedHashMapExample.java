package org.example.lesson20.map;

import org.example.lesson20.person.Person;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapExample {
//LinkedHashMap - хээшмап, который дополнительно содержит в себе связный список, сохраняет последовательность объектов, благодаря LinkedList внутри его
    static void main(String[] args) {

        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(29, "Petr", "Petrov");
        Person sveta = new Person(3, "Sveta", "Sveticova");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(),ivan);
        map.put(petr.getId(),petr);
        map.putIfAbsent(sveta.getId(),sveta);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() );
            
        }
    }

}
