package org.example.Lesson18;

import org.example.Lesson12.Archer;
import org.example.Lesson12.Hero;
import org.example.Lesson12.Warrior;
import org.example.Lesson18.weapon.Bow;
import org.example.Lesson18.weapon.Sword;
import org.example.Lesson18.weapon.Weapon;

public class WeaponRunner {

     static void main() {
        Archer<Bow> archer = new Archer<>("Леголас", 15);
        archer.setWeapon(new Bow()); //Из всех оружий можем дать только Лук

        Warrior<Sword> warrior = new Warrior<>("Боромир", 15);
        warrior.setWeapon(new Sword());

        printWeaponDamage(archer); //если меняется пермонаж, меняется и тип
    }
//Параметризация на уровне метода
    //Наследование работает на уровне ссылок (Hero), но не работает в параметризации, тут нужен конкретный тип, поэтому мы и используем <T>, чтобы в зависимости от ссылки подбирался тип
    public static <T extends Weapon> void printWeaponDamage(Hero<T> hero) {
        System.out.println(hero.getWeapon().getDamage());

        //Wildcard
        //public static void printWeaponDamage(Hero<? extends Weapon> hero) - мы можем передать любого героя, который параметризован чем то, что экстендит вэпон
        //Приедущество: можем указывать ограничение не только сверху, но и снизу (заменяя expends на super и указывать нижний класс)
        //Consumer - потребляет - super
        //Producer - возвращает - extends
    }
}
