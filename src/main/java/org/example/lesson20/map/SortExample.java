package org.example.lesson20.map;

import org.example.lesson20.person.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {

    static void main(String[] args) {
        //List.of() - неизменяемая коллекция
        //Array.asList - позволяет вносить изменения
        List<String> strings = Arrays.asList("123", "345", "12", "646");

        //Сортировка - упорядочивание элементов коллекции по заданным нами критериями
        //Collections - утилитный класс, который позволяет работать с коллекциями, имеет множество своих методов
        Collections.sort(strings); //Класс String уже реализует метод Comparable, расставляя в алфавитном порядке
        System.out.println(strings); //выводит в алфавитном порядке

        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(29, "Petr", "Petrov"),
                new Person(3, "Sveta", "Sveticova")
        );
        Collections.sort(personList); //все элементы коллекции должны реализовывать интерфейс Comparable (метод compareTo принимает объект, возвращает инт: возвращает 0, если объекты равны, 1 - если объект больше, -1 - если меньше)
        System.out.println(personList); //сортировка по айди по возрастанию (по умолчанию)
        //Comparable - сортировка только по умолчанию
        //Comparator - второй интерфейс сортировки (принимает 2 объекта одного и того же типа, возвращает инт)
//        Collections.sort(personList, new FirstNameComparator());
        personList.sort(new FirstNameComparator()); //- упрощенный вариант, метод сорт от интерфейса Лист
        personList.sort(Comparator.comparing(Person::getName).thenComparing(Person::getLastName));//- еще более упрощенный вариант + можно добавлять условия сортировки, не создавая компоратор
        System.out.println(personList);

    }

    public static class FirstNameComparator implements Comparator<Person> {
//Компаратор по name
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
