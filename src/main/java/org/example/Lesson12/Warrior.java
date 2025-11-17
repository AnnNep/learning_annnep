package org.example.Lesson12;

public class Warrior extends Hero {
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy   enem) {
        System.out.println(getName() + " взмахнул мечом на " + enem.getName());
        enem.takeDamage(getDamage());
    }
}
