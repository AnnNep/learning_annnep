package org.example.lesson20.map;

import org.example.lesson20.person.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(29, "Petr", "Petrov");
        Person sveta = new Person(3, "Sveta", "Sveticova");
        Person sveta1 = new Person(30, "Sveta1", "Sveticova1");
        Person sveta2 = new Person(45, "Sveta2", "Sveticova2");
        Person sveta3 = new Person(10, "Sveta3", "Sveticova3");

        Map<Integer, Person> map = new TreeMap<>(); //если HashMap - без сортировки, рандомно выводит, то TreeMap сортирует по ключу
        //TreeMap изначально сортерует по умолчанию, но при добавлении компоратора можно задать свои условия сортировки
        //В качестве ключа используем объект, который реализовывает интерфейс Comparable или при создании TreeMap в конструктор мы должны передавать компоратор
        map.put(ivan.getId(),ivan);
        map.put(petr.getId(),petr);
        map.putIfAbsent(sveta.getId(),sveta);
        map.putIfAbsent(sveta1.getId(),sveta1);
        map.putIfAbsent(sveta2.getId(),sveta2);
        map.putIfAbsent(sveta3.getId(),sveta3);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
// Бинарные деревья - каждый узел содержит 2 потомка
// TreeMap использует Red-black tree с корнем рут
// Балансировка дерева - его перестроение, выбирается root, используется не часто, так что производительность O(log n)
    }

}
