package org.example.Lesson5_1;

public class Laptop extends Computer {

    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
        super.getRam();
        super.getSsd();
        getWeight();
    }

    public void open() {
        System.out.println("Opening laptop");
    }

    public int getWeight() {
        return weight;
    }
}
