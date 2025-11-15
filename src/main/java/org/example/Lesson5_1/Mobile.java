package org.example.Lesson5_1;

public class Mobile extends Computer{


    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }
//Полиморфизм - один интерфейс и множество инициализаций
//Интерфейс - открытый функционал, унаследованный от базового класса

    @Override
    public void load() {
        System.out.println("Я включился");

    }
}
