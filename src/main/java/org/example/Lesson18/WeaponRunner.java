package org.example.Lesson18;

import org.example.Lesson12.Archer;
import org.example.Lesson12.Warrior;
import org.example.Lesson18.weapon.Bow;
import org.example.Lesson18.weapon.Sword;

public class WeaponRunner {

     static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Леголас", 15);
        archer.setWeapon(new Bow()); //Из всех оружий можем дать только Лук

        Warrior<Sword> warrior = new Warrior<>("Боромир", 15);
        warrior.setWeapon(new Sword());

    }
}
