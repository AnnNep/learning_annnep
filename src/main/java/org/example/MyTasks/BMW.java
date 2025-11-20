package org.example.MyTasks;

public class BMW extends Car{

    public BMW(int howOftenTO, String country, int year) {
        super(howOftenTO, country, year);
    }

    @Override
    public void CarAdvantages() {
        System.out.println("BMW известен спортивной направленностью и высоким уровнем технологий");
    }

}

