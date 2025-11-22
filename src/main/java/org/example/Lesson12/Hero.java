package org.example.Lesson12;

import org.example.Lesson18.weapon.Weapon;

public abstract class Hero <T extends Weapon> { //Параметризуем на уровне класса
//Хиро принимает что-то, что является Вэпоном, таким образом наследники Хиро принимают одно из оружий (а не другие типы данных)
    private String name;
    private int damage;
    private T weapon; //Используем параметр

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(Enemy enem);

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
