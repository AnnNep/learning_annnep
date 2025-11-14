package org.example.Lesson5_1;
// Laptop <- Computer <- Object (класс, наследуемый по умолчанию)

public class Laptop extends Computer {
//Наследование - объект одного класса наследует поля/функционал от другого
    private int weight;
//В самой первой строчке конструктора-наследника обязан быть вызван конструктор баз класса через супер
    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram); //через super можно достучаться до всего, что доступно в базовом классе
        this.weight = weight;
        super.getRam(); //через геттеры можно достучатья до private полей
        super.getSsd();
        getWeight();
    }
//В java можно наследовать только 1 класс, в с++ много
    public void open() {
        System.out.println("Opening laptop");
    }

    public int getWeight() {
        return weight;
    }
}
