package org.example.Lesson5_1;

public class Computer {
    //Инкапсуляция - скрытие данных (сложностей в коде) от пользователя
    private Ssd ssd;
    private Ram ram; //Поля с private можнем считать инкапсуляцией

    public Computer (Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public Computer () { //Если конструктор без параметров, в наследнике можно упустить строчку super();
        this(null, null); //В конструкторе без параметров вызвать конструктор с параметроми
                                   // Чтобы не дублировать код в конструкторах
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
