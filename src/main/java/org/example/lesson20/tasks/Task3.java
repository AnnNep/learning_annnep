package org.example.lesson20.tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task3 {
//    Написать метод isUnique, который принимает Map, String, String,
//    возвращает тру, если каждому ключу соответствует свое уникальное значение
//    Например, в данном случае вернется тру:
//    {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
//    А в данном фолс
//    {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruse=Reges, Hal=Perkins}
static void main(String[] args) {
//    Map<String, String> map = new HashMap<>();
//    map.put("Marty","Stepp");
//    map.put("Stuart","Reges");
//    map.put("Jessica","Miller");
//    map.put("Amanda","Camp");
//    map.put("Hal","Perkins");

    Map<String, String> map = Map.of(
            "Marty","Stepp",
            "Stuart","Reges",
            "Jessica","Miller",
            "Amanda","Camp",
            "Hal","Perkins"
    );
    System.out.println(isUnique(map));
}
public static boolean isUnique(Map<String, String> map){
//ХэшСет проверяет уникальность значений
    int i = new HashSet<>(map.values()).size();
    System.out.println(i);
    return map.size() == i;
}
}
