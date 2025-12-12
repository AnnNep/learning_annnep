package org.example.lesson20.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    //Написать метод, который принимает целочисленный список и возвращает целочисленный список только с нечетными значениями

    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 6, 8, 9, 13, 20)); //Мы програмируем на уровне интерфейсов, а не реализаций, поэтому ссылка - интерфейс List
        //List of возвращает неизменяемую коллекцию
        //Array as List нельзя менять размер массива, но можно переставлять элементы и изменять их
        //for each (iter) - только для чтения, нельзя изменять коллекцию, итерируясь по ней
        List<Integer> result = removeEven(list);
        System.out.println(result);
    }

    private static List<Integer> removeEven (List<Integer> list){
        //Правило хорошего тона: не изменять параметры методов, а создавать новый объект для результата
        List<Integer> result = new ArrayList<>();
        for (Integer value : list) {
            if (value % 2 != 0) {
                result.add(value);
            }

        }
        return result;
    }
}
