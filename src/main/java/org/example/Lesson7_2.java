package org.example;

public class Lesson7_2 {
    static void main() {
        int [] values = {1, 2, 3, 4, 5};
        int [][] values2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i< values2.length; i++) {
            int [] ints = values2 [i];
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints [j] + " ");
            }
            System.out.println();
        }
    }
}
