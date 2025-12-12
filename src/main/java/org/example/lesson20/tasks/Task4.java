package org.example.lesson20.tasks;

import java.util.*;
import java.util.Map.Entry;

public class Task4 {
//    Сложить два многочлена заданной степени, если коэффициенты
//    многочлена хранятся в объекте HashMap в виде:
//    Ключ: номер степени
//    Значение: значение множителя
//    Вывести результатирующий многочлен в виде строки:
//    ax^6 + bx^4 + cx^3 + dx + 8
static void main(String[] args) {
    Map<Integer, Integer> polynomal1 = Map.of(
            0, 5,
            1, 3,
            3, 2,
            5, 4,
            6, 7
    );
    Map<Integer, Integer> polynomal2 = Map.of(
            0, 5,
            3, 4,
            5, 5,
            6, 1
    );
    Map<Integer, Integer> sum = sum(polynomal1, polynomal2);
    //8x^6 + 9x^5 + 6x^3 + 3x^1 + 10
    System.out.println(convertToString(sum));
}

public static String convertToString(Map<Integer, Integer> map) {
    Map<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
    result.putAll(map);
    List<String> list = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
        String value = entry.getKey() == 0
                ? String.valueOf(entry.getValue())
                : entry.getValue() + "x^" + entry.getKey();
        list.add(value);
    }
    return String.join(" + ", list);
}

public static Map<Integer, Integer> sum (Map<Integer, Integer> polynomal1, Map<Integer, Integer> polynomal2) {
    Map<Integer, Integer> polynomalResult = new HashMap<>(polynomal1);
    for (Map.Entry<Integer, Integer> entry : polynomal2.entrySet()) {
        Integer value = polynomalResult.getOrDefault(entry.getKey(), 0);
        polynomalResult.put(entry.getKey(), value + entry.getValue());
        polynomalResult.merge(entry.getKey(), entry.getValue(), Integer::sum); //написание кода в функциональном стиле
    }
    
    return polynomalResult;
}
}
