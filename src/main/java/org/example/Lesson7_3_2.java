package org.example;

public class Lesson7_3_2 {
    /*  Написать программу, заносящую в массив первые 100 целых чисел,
     *  делящихся на 13 или на 17, и печатающую их.
     */

    static void main() {
        int[] values = new int[100];
        fillArray(values);
        Lesson7_3.printArray(values);
    }

    public static void fillArray(int[] values) {
        int currentIndex = 0;
        for (int currentValue = 1; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex] = currentValue;
                currentIndex++;
            }
        }
    }
}