package org.example;

public class Lesson6_3 {
//Задача 1: Написать программу, высчитывающую факториал введёного числа

    static void main() {
        int value = 5;
        int result = Ex2(value);
        System.out.println(result);
    }

    public static int Ex2 (int value) {
        int result = 1;
        while (value > 0) {
           result *= value;
           value--;
        }
        return result;
    }

    public static int Ex1(int value) {
        int result = 1;
        for (int number = value ; number > 0; number--) {
            result *=  number;
        }
        return result;
    }
}


