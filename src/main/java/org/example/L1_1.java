package org.example;

public class L1_1 {

    public static void main(String[] args) {
        int value = 10;
        int [] values = {value, 100, 199, 25};
        printArray(values);

    }

    public static void printArray (int [] values){
        for (int value : values) {
            System.out.println(value);

        }
    }
}
