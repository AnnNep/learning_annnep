package org.example.Lesson5_1;

public abstract class Computer {
//Абстрактный класс - класс, созданный только для того, чтобы его наследовали (+ запрещает создавать объект класса)
    //Инкапсуляция - скрытие данных (сложностей в коде) от пользователя
    private Ssd ssd;
    private Ram ram; //Поля с private можнем считать инкапсуляцией

    {
        System.out.println("init block computer");
    }
//Static блок инициализации вызывается первым, так как относитмся к объекту класса класс
//Однако от single tone, т. е. существует в 1 экземпляре
    static {
        System.out.println("static block computer");
    }

    public Computer (Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public Computer () { //Если конструктор без параметров, в наследнике можно упустить строчку super();
        System.out.println("Constructor computer");
    }
    //Public методы можно называть интерфейсом (открытая часть класса)

    public abstract void load(); //Абстрактный метод не имеет ревлизации
                                 //Вопрос: зачем он тогда вообще нужен?

//    public void load() {
//        System.out.println("Loading...");
//    }

    public void print() {
        System.out.println("Ssd: " + ssd.getValue() + " Ram: " + ram.getValue());
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam(){
        return ram;
    }
}
