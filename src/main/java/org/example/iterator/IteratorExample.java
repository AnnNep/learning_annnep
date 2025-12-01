package org.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    static void main(String[] args) {
        //По этому шаблону мы можем создать любую структуру данных и итерировать по ней (форич)
        //Можно удалять элементы коллекции, если реализован и вызван метод ремув (кроме List of)
        List<Integer> sourcelist = List.of(1, 2, 3, 4, 5, 6); //Неизменяемая коллекция
        List<Integer> list = new ArrayList<>(sourcelist); //Теперь эту же коллекцию можно менять

//        for (int i = 0; i < list.size(); i++) {
//            Integer integer = list.get(i);
//        }
//        for (Integer integer : list) { //ForEach был создан для коллекций
//            System.out.println();
//        }
        //Итератор - шаблон проектирования

        //Итерируемся по коллекции и удаляем элементы:
        //Через цикл foreach удалить элементы не получится, будет ошибка
        //FOREACH только для чтения
        //Вызывая метод hasNext() - смотрим, есть ли элемент
        //Вызывая метод next() - передвигаем курсор
        for(Iterator<Integer>iterator = list.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            if(next == 3 || next ==4) {
                iterator.remove();
            }
        }
        System.out.println(list);

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            System.out.println(next);
//        }


    }
}
