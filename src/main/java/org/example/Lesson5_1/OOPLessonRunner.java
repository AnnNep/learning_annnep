package org.example.Lesson5_1;

public class OOPLessonRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(1024);
        Computer computer = new Computer(ssd, ram);
        computer.load();
        double sin = Math.sin(2.5);
        //Инкапсуляция - скрытие сложностей кода, то есть один раз написал
        // сложную функцию, в дальнейшем просто вызывю метод
        Laptop laptop = new Laptop (new Ssd(500),new Ram(1024), 2);
        laptop.open();
        laptop.load();
        System.out.println(laptop); // В println есть String.valueOf, в котором есть obj.toString
        //Выводит полное название класса и hashcode

    }
}
