package org.example.lesson20.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    static void main(String[] args) {
        Set<String> set = new HashSet<>();// Set - Утильный класс, похож на списки, но не позволяет добавлять дубликаты, работает только с ключами, нельзя сортировать!
        //Сортировка может быть только по интерфейсу List, поэтому для сортировки использовать нужно только TreeSet
        //По сету можно только проитерироваться
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("b"); //этот элемент не вывелся т к он дубликат (метод add проверяет булеаном)
        //new HashSet - выводит в рандомном порядке
        //new LinkedHashSet - выводит в изначальном порядке
        //new TreeSet - выводит в алфавитном порядке
        System.out.println(set);
    }
}
