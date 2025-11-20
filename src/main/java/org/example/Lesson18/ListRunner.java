package org.example.Lesson18;

import org.example.Lesson12.Archer;

public class ListRunner {
    static void main() {
        List<String> list = new List<>(10);//Если класс параметризован т. е. содержит какой то тип, то мы обязаны указать его
        list.add("String1");
        list.add("String2");
        list.add("String3");

        String element = list.get(1); //Как только мы получаем какой то элемент из списка, на не нужно его приводить к какому то типу
        System.out.println(element);

    }
}
