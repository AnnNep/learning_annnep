package org.example.Lesson12;

public class Archer extends Hero {

    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enem) {
        System.out.println(getName()+ " стрельнул из лука в " + enem.getName());
        enem.takeDamage(getDamage());
    }
}
