package org.example;

public class Lesson7_1 {
    static void main() {
        int[] values = new int [10];
//        System.out.println(values[5]);
        values[4] = -9;
        values[7] = 98;
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

    }

    private static void test() {
        //               0  1  2  3  4
        int [] values = {1, 5, 6, 8, 9};
        System.out.println(values[2]);

        values[3] = 18;
        System.out.println(values [3]);
    }
}
