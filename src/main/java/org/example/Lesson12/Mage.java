package org.example.Lesson12;

import org.example.Lesson18.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends  Hero<T> {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy  enem) {
        System.out.println(getName() + " сотворил заклинание на " + enem.getName());
        enem.takeDamage(getDamage());
    }
}
