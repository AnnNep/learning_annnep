package org.example.iterator;

import org.example.Lesson18.List;

public class ListExample {
    public static void main(String[] args) {
        //Итерируемся по нашему кастомному классy (который мы даже не реализовали коллекцией)
        List<String> list = new List<>(10);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (String value : list) {
            System.out.println(value);
        }
        //То же самое, что и 3 строчки выше, более красивая версия
        list.iterator().forEachRemaining(System.out::println);
    }
}
