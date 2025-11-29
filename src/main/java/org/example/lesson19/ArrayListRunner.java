package org.example.lesson19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListRunner {
    static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        //LinkedList - реализация списка, которая не базируется на массиве
        //LinkedList - список, у которого есть ссылки на первый элемент и последний
        //Node <E> - оболочка одного элемента массива (занимает в 3 раза больше памяти, чем в аррейЛисте)
        //E item
        //Node<E> next
        //Node<E> prev
        //Сравнение ArrayList и LinkedList
        //Поиск по значению: ArrayList и LinkedList - сравнивание каждого элемента, пока не найдем одинаковые O(n)
        //Поиск по индексу: ArrayList O(1) быстрее, чем LinkedList O(n)
        //Добавить или удалить элемент: ArrayList и LinkedList - одинаковое количество времени O(n) (но ArrayList проигрывает по памяти O(n), т. к. мы копируем часть массива, а в LinkedList O(1) мы просто меняем ссылки)
      //Мы не можем использовать в качестве дженериков примитивные типы <int>, поэтому пишем обертку для этого типа <Integer>
        //Мы должны программировать на уровне интерфейсов, а не их реализаций, поэтому заменяем
        //ArrayList<Integer> integers = new ArrayList<>();
        //на List<Integer> integers = new ArrayList<>();
        //Пока не добавили первый элемент массива, используется заглушка, не позволяющая создавать массив
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        System.out.println();
        //по умолчанию размер 5, но нужно добавть шестой элемент, поэтому запускается механизм увеличения массива на 2 по формуле grow, но массив, как структура данных, не умеет увеличиваться, поэтому мы создаем новый массив: из старого массива копируются значения в новый, остаток заполняется наллами, так как все коллекции содержат ссылки на объекты (поэтому заполняем не int значениями, а null)
        // [1, 2, 3, 4, 5]
        // [1, 2, 3, 4, 5, 6, null]

        System.out.println(integers.get(5)); //Получем значение по индексу: 6
        System.out.println(integers.contains(4)); //Проверяем, содержиться ли 4, как значение: true
    }
}
