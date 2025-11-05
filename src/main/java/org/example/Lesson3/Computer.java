package org.example.Lesson3;

public class Computer {
    int ssd = 500; //Поля класса (поля со значением - состояние объекта)
    long ram;

    Computer() {
        System.out.println("Я был создан");
    }

    Computer(int Ssd, long newRam) {
        this.ssd = Ssd;
        ram = newRam;
    }

    Computer(int newSsd) {
        ssd = newSsd;
    }

    void load() { //Метод - функция внутри класса
        System.out.println("Я загрузился");
    }

    void load(boolean open) {
        System.out.println("Я загрузился");
        if (open) {
            System.out.println("открыл крышку");
        }
    }

    void printState() {
        System.out.println("SSD: "+ssd);
        System.out.println("RAM: "+ram);
        System.out.println();
    }
}
