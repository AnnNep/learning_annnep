package org.example.Lesson5_1;



public class Computer {

    private Ssd ssd;
    private Ram ram;

    public Computer (Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public void load() {
        System.out.println("Loading...");
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam(){
        return ram;
    }
}
