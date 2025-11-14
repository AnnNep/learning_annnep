package org.example.Lesson5_1;

public class Computer {
    //Инкапсуляция - скрытие данных (сложностей в коде) от пользователя
    private Ssd ssd;
    private Ram ram; //Поля с private можнем считать инкапсуляцией

    public Computer (Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }
    //Public методы можно называть интерфейсом (открытая часть класса)
    public void load() {
        System.out.println("Loading...");
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam(){
        return ram;
    }
}
