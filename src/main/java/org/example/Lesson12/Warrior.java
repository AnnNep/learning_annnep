package org.example.Lesson12;

import org.example.Lesson18.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy   enem) {
        System.out.println(getName() + " взмахнул мечом на " + enem.getName());
        enem.takeDamage(getDamage());
    }
}
