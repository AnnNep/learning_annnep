package org.example.Lesson5_1;

public class OOPLessonRunner4 {

    public void main(String[] args) {
        Printable laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Printable mobile = new Mobile(new Ssd(125), new Ram(512));

        print(laptop, mobile);
    }

    public static void print(Printable... objects) {
        for (Printable object : objects) {
           object.print();
            System.out.println();
        }
    }
}
