package org.example.lesson21;

public class Task2 {
    //Написать код, который создаст, а затем отловит ArrayIndexOutOfBonusException
    //Ошибка возникает, когда мы выходим за пределы массива (RuntimeException)
    //Когда создаем собственное исключение, используем RuntimeException

    static void main(String[] args) {

        int[] value = {1, 4, 6, 7, 8};
        try {
            for (int i = 0; i <= value.length; i++) {
                System.out.println(value[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("catch");
            exception.printStackTrace();
        }
        System.err.println("end");

    }
}
