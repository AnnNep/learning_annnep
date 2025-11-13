package org.example.Lesson5_1;

public class OOPLessonRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(1024);
        Computer computer = new Computer(ssd, ram);
        computer.load();
        double sin = Math.sin(2.5);

        Laptop laptop = new Laptop (new Ssd(500),new Ram(1024), 2);
        laptop.open();
        laptop.load();

    }
}
