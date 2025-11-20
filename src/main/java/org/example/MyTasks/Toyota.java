package org.example.MyTasks;

public class Toyota extends Car{

    public Toyota(int howOftenTO, String country, int year) {
        super(howOftenTO, country, year);
    }

    @Override
    public void CarAdvantages() {
        System.out.println("Toyota славится надёжностью и экономичностью");
    }

}
