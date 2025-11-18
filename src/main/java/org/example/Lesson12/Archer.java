package org.example.Lesson12;

public class Archer extends Hero {

    private Wolf wolf;

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy enem) {
        //Локальный класс - класс, объявляемый внутри метода (не используется на практике, но нужно знать, что такой есть)
        class Test {

        }

        Test t = new Test();
        t.toString();

        System.out.println(getName() + " стрельнул из лука в " + enem.getName());
        wolf.attackEnemy(enem);
    }
    public static class Wolf{ //Без static - внутренний класс, с static - вложенный
        private String name;
        private int damage;

        public Wolf(String name, int damage) {

          this.name = name;
          this.damage = damage;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println(name+ " и " + Archer.this.getName() + " наносят совместный урон");
        enemy.takeDamage(damage + Archer.this.getDamage()); //Обращение к объекту внешнего класса
        }
    }
}
