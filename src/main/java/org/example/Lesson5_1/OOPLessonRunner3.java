package org.example.Lesson5_1;

public class OOPLessonRunner3 {
    static void main() {
        //Тип ссылки заменили на Computer т. к. можно применить к объектам понятие "является"
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));

        loadComputers(laptop, mobile);
        printInformation(new Computer[]{laptop, mobile});
    }

    public static void printInformation (Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
        }
    }

    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}
