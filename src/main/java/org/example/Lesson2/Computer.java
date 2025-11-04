package org.example.Lesson2;

public class Computer {
    int ssd = 500; //Поля класса
    int ram = 1024;

    void load() { //Метод - функция внутри класса
        System.out.println("Я загрузился");
    }

    void printState() {
        System.out.println("SSD: "+ssd);
        System.out.println("RAM: "+ram);
    }
}
