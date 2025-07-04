package battlearena;

import static battlearena.Enemy.getNumberOfEnemies;

public class Main {

    public static void main(String[] args) {
        Zombie zombie = new Zombie(10, 2);
        Ogre ogre = new Ogre(20, 3);

        System.out.println("There are " + getNumberOfEnemies() + "enemies ready to fight!");

        battle(ogre, zombie);
    }

    public static void battle(Enemy enemy) {
        enemy.talk();
        enemy.attack();
    }

    public static void battle(Enemy e1, Enemy e2) {
        e1.talk();
        e2.talk();

        while (e1.getRemainingHealthPoints() > 0 && e2.getRemainingHealthPoints() > 0) {
            System.out.println("\n\t-----------");
            e1.specialAttack();
            e2.specialAttack();

            System.out.println("\nEnemy 1: " + e1.getRemainingHealthPoints() + " HP left");
            System.out.println("Enemy 2: " + e2.getRemainingHealthPoints() + " HP left");

            e2.attack();
            e1.setRemainingHealthPoints(e1.getRemainingHealthPoints() - e2.getAttackDamage());

            e1.attack();
            e2.setRemainingHealthPoints(e2.getRemainingHealthPoints() - e1.getAttackDamage());
        }
        System.out.println("---Final---");
        if (e1.getRemainingHealthPoints() > 0) {
            System.out.println("Enemy 1 wins!");
        }
        if (e2.getRemainingHealthPoints() > 0) {
            System.out.println("Enemy 2 wins!");
        }
    }
}
