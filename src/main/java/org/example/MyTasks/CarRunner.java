package org.example.MyTasks;

public class CarRunner {
    static void main(String[] args) {
        Car car = new BMWv1 (11,"Германия", 2015, "cool sound");
        System.out.println(car.ride());
        Car car2 = new BMW(10,"Германия",2020); //Созданный объект имеет функции только базового класса Кар
        BMW bmw = new BMW(7,"Германия",2017); //А у этого объекта добавляется функционал наследника БМВ
        Toyota toyota = new Toyota(15, "Япония", 2013);
        toyota.CarAdvantages();
        toyota.CarInformation();

    }
}
