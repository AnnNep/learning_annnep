package org.example.lesson20.tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
//    Написать метод countUnique, который принимает целочисленный
//    список в качестве параметра и возвращает количество уникальных
//    целых чисел в этом списке.
//
//    При получении пустого списка метод должен возвращать 0
//    Пример: [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернет 5

    static void main(String[] args) {
        List<Integer> integers = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(countUnique(integers));
    }

    private static int countUnique(List<Integer> list){
        //Уникальность ключей - свойство коллекции Set, основанной на структуре данных ассоциативного массива Map, уникальность которой мы воспользуем
        //Set - гарантия уникальности
        //Если на вход предоставляется коллекция, которая не является множеством, то мы все равно можем создать множество и в качестве параметра установить любую коллекцию
        return new HashSet<>(list).size();

        //Ctrl + Alt + N - inline variable

    }

}
