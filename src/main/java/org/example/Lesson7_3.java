package org.example;

public class Lesson7_3 {
    static void main() {
//    Написать программу, которая печатает массив сначала в обычном порядке, затем в обратном.
    int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(values);
        Foreach(values);
        printArrayReverse(values);

    }

    public static void printArrayReverse(int[] values) {
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    private static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

    } private static void Foreach (int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
