package org.example.MyTasks;

public class Kia extends Car {

    public Kia(int howOftenTO, String country, int year) {
        super(howOftenTO, country, year);
    }

    @Override
    public void CarAdvantages() {
        System.out.println("Kia отличается разнообразием моделей — представлены хэтчбеки, седаны, универсалы, минивэны, кроссоверы и внедорожники");
    }
}
