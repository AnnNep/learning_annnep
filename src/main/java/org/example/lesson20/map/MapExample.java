package org.example.lesson20.map;

import org.example.lesson20.person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");
//Ассоциативный массив создает в себе два дженерик типа: ключ и значение (чтобы по ключу получить/положить значение)
//        (ключ, id)
        Map<Integer, Person> map = new HashMap<>(); //Map - интерфейс, HashMap - его реализация
        map.put(ivan.getId(),ivan);
        map.put(petr.getId(),petr);

        System.out.println(map.get(2));

        //Map не является коллекцией, но содержить их:
        System.out.println(map.keySet()); //набор всех ключей
        System.out.println(map.values()); //коллекция значений
        System.out.println(map.entrySet()); //множество всех ключей и значений пар(объект типа Node<K,V> реализует интерфейс Entry<K,V>
    //Мы можем итерироваться по любым из этих коллекций
        for (Person person : map.values()) {
            System.out.println(person.getName());
        }

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(map.containsKey(1)); //есть ли в мап нод с таким ключем
        System.out.println(map.size()); //сколько ключей мап
        System.out.println(map.isEmpty()); //пустая ли map
        System.out.println(map.putIfAbsent(1,new Person(1, "Ivan", "Ivanov"))); //если такой ключ существует, то не класть новое значение
        System.out.println(map.getOrDefault(5,new Person(1, "Ivan", "Ivanov")));//если под 5 индексом ничего нет, то пусть будет дефолтная строчка
        //load factor - создание нового массива происходит не когда старый размер полностью заполнен, а когда заполнен какой то его процент, например 70%
        //при увеличении массива нужно перераспределить все ноды, так как индексы нодов снова нужно пересчитывать
        //Map не поддерживает повторение ключей, он должен быть уникальным, иначе одно значение перетирается другим

        //Поле table - массив
        //Класс node - каждая ячейка
        //HashMap - основан на хэш таблицах, а это просто массив из 16 ячеек по умолчанию
        //Хэш таблицы должны быть кратны 2 в какой то степени

        //Как определить в какую ячейку положить Person (ivan):
        //map.put(ivan.getId(),ivan) -> происходит это: ivan.getId().hashCode() (вызывается функция хэшкод и возвращает хэшкод интеджера)
        //Допустим это 35, нужно вычислить остаток от деления на количество ячеек в таблице (16)
        //35 % 16 = 3 - индекс, куда нужно установить ваню
        //Создается объект класса нод:
         //Node<K,V>
         //int hash; (36)
         //K key; (1)
         //V value; (ivan)
         //Node<K,V> next

        //Наоборот получение из хеш таблицы:
         //map.get(1) - для определения ячейки работаем только с ключем
         //1.hashCode - хэшкод ключа
         //35 % 16 = 3 - определяем в какой ячейке находится ваня
         //получаем нод, откуда возвращает объект value, т. е. ivan

        //Приемущество: доступ по индексу у массива за константное время О(1)
        //Коллизия - совпадение хэшкода у двух разных объектов (некст указывает на следующий нод(время О(n)), создается связанный список, если элементов больше 8, то создается дерево (время log n))
        //При коллизии мы получаем объект по индексу через  equals, сравнивая поочередно объекты
    }
}
