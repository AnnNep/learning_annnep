package org.example.lesson22;

import java.util.Comparator;

public class LambdaExample {

    static void main(String[] args) {
        // Comparator<Integer> comparator = new IntegerComparator();
        //заменили на лябду выражение
        Comparator<Integer> comparator = Integer::compare; //(1)   класс + метод в этом классе
        System.out.println(comparator.compare(25, 100)); //на выходе -1, потому что 25 меньше 100

    }

    //(2)     блоки кода 1 и 2 - это то же самое, но 1 написан емко
    //private static class IntegerComparator implements Comparator<Integer> {

//        @Override
//    //  модиф возвр назван (параметры)
//        public int compare(Integer o1, Integer o2) {
//            return Integer.compare(o1, o2);
//        }
// Lambda выражения -функция, которую мы переопределяем у функционального интерфейса
//        (Integer o1, Integer o2) -> {
//            return Integer.compare(o1, o2);
//        }
    }


    //начиная с 8 версии джавы используем интерфесы, как стрелочные функции, если у интерфейса один метод
    //а раньше создавали анонимные классы

//function, predicate, consumer, supplier, bifunction, biconsumer - функциональные интерфейсы
