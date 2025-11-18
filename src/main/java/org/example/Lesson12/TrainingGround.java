package org.example.Lesson12;

public class TrainingGround {

    public static void main(String[] args) {
        Hero war = new Warrior("Боромир", 15);
        Hero mag = new Mage("Гэндольф", 20);
        Archer arc = new Archer("Леголас", 10);

//        Archer.Wolf wolf = arc.new Wolf("Second Wolf", 11); //Мы создаем объект внутреннего класса, используя ссылку внешнего класса
        Archer.Wolf wolf = new Archer.Wolf("Second Wolf", 11); //А для вложенных классов наоборот: не нужно использовать ссылку внешнего класса, взамен пишем полный путь к классу Wolf
//Можно сделать импорт класса арчер, чтобы не ссылаться на него
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
