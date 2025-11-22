package org.example.MyTasks;

public final class BMWv1 extends BMW {
    //От класса БМВв1 уже не будут создаваться наследники, так как это конкретный, не абстрактный объект
    private String sound;

    public BMWv1(int howOftenTO, String country, int year, String sound) {
        super(howOftenTO, country, year);
        this.sound = sound;

    }

}
