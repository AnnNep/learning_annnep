package org.example.MyTasks;

public class CarRunner {
    static void main(String[] args) {
        Car car = new BMWv1 (11,"Германия", 2015, "cool sound");
        System.out.println(car.ride());
        Car car2 = new BMW(10,"Германия",2020);
        BMW bmw = new BMW(7,"Германия",2017);
        Toyota toyota = new Toyota(15, "Япония", 2013);
        toyota.CarAdvantages();
        toyota.CarInformation();

    }
}
