package org.example.Lesson5_1;
// Laptop <- Computer <- Object (класс, наследуемый по умолчанию)

public final class Laptop extends Computer {
//Наследование - объект одного класса наследует поля/функционал от другого
//Final - запрет на наследование от данного класса
    private int weight;

    //Блоки инициализации
    {
        System.out.println("init block laptop");
    }

    static {
        System.out.println("static block laptop");
    }

//В самой первой строчке конструктора-наследника обязан быть вызван конструктор баз класса через супер
    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram); //через super можно достучаться до всего, что доступно в базовом классе
        this.weight = weight;
        super.getRam(); //через геттеры можно достучатья до private полей
        super.getSsd();
        getWeight();
    }

    public Laptop() {
        System.out.println("Constructor laptop");
    }

    @Override //Переопределение методов
    public void load() {
        open();
        System.out.println("Я загрузился");
    }
//При переопределении метода можно изменять его: добавить функционал, отказаться от функционала базового класса, менять последовательность

    @Override
    public void print() { //Переопределение не абстрактного метода
        super.print();
        System.out.println("weight = " + weight);
    }

    //В java можно наследовать только 1 класс, в с++ много
    public void open() {
        System.out.println("Opening laptop");
    }

    public int getWeight() {
        return weight;
    }
}
