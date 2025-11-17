package org.example.Lesson12;

public class TrainingGround {

    public static void main(String[] args) {
        Hero war = new Warrior("Боромир", 15);
        Hero mag = new Mage("Гэндольф", 20);
        Hero arc = new Archer("Леголас", 10);

        Enemy enem = new Enemy("Зомби", 100);

        attackEnemy(enem,war,mag,arc);
    }

    public static void attackEnemy(Enemy enem, Hero... heroes) {
        while (enem.isAlive()) {
            for (Hero hero : heroes) {
                if (enem.isAlive()) {
                    hero.attackEnemy(enem);
                }
            }
        }
    }
}
