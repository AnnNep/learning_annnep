package org.example.Lesson5_1;

public class OOPLessonRunner2 {

    public static void main(String[] args) {
        //Laptop -> Computer -> Object
        //Laptop <- Computer <- Object

//        Computer comp = new Laptop()
//        comp. <- здесь доступны методы только класса Computer, потому что типом ссылки является Computer
//
//        Laptop comp = new Laptop()
//        comp. <- доступны методы Computer & Laptop, т. к. Laptop является наследником Computer и класс Laptop добавляет свой функционал
//
//        Object obj = new Computer()/ new Laptop()
//        obj. <- доступны методы только класса Object (базовый класс для всех классов в java) (toString можешь пока заюзать)


        new Laptop();
    }
}
