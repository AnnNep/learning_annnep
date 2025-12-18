package org.example.lesson21;

public class Task3 {
    //Создать собственный класс-исключение - наследник класа Exception
    //создать метод, выбрасывающий это исключение
    //вызвать этот метод и отловить исключение
    //вывести stack trace в консоль

    static void main(String[] args) {
        try {
            unsafe();
        } catch (MyException e) {
            System.out.println(e.getMessage()); //объект exception тоже имеет различные методы
            System.out.println(e.getCause());
            e.printStackTrace();
        }

    }

    public static void unsafe() throws MyException {
        throw new MyException(new RuntimeException("runtime exception"));
    }
}
