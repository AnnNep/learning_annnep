package org.example;

public class Lesson6_3_2 {
    //Задание 2. Имеется число, посчитать сумму цифр данного числа.
    static void main() {
        int value = 456;
        int result = sumWhile(456);
        System.out.println(result);

    }
    public static int sum (int value){
        int summa = 0;
        for (int i = value; i != 0; i /= 10) {
            summa +=  i%10;
        }
    return summa;
    }

    public static int sumWhile (int value){
        int summa = 0;
        int i = value;
        while (i != 0) {
            summa += i%10;
            i/=10;
        }
        return summa;
    }
}
