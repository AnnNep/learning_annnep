package org.example.Lesson5_1;

public class OOPLessonRunner3 {
    static void main() {
        //Тип ссылки заменили на Computer т. к. можно применить к объектам понятие "является"
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));

        Laptop laptop1 = new Laptop(new Ssd(5000), new Ram(10000), 5);

//        loadComputers(laptop, mobile);
        printInformation(new Computer[]{laptop, mobile, laptop1});
    }

    public static void printInformation (Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
            //instanceof проверяет, действительно ли ссылка Computer ведет на объект типа laptop
            if (computer instanceof Laptop) {
                Laptop laptop = (Laptop) computer;
                laptop.open();
            }
            System.out.println();
        }
    }

    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}
