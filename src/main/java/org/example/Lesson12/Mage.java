package org.example.Lesson12;

public class Mage extends  Hero {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy  enem) {
        System.out.println(getName() + " сотворил заклинание на " + enem.getName());
        enem.takeDamage(getDamage());
    }
}
