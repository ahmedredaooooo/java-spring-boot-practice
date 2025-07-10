package battlearena;

import battlearena.enemies.Enemy;
import battlearena.enemies.enemy.Ogre;
import battlearena.enemies.enemy.Zombie;
import battlearena.heros.Hero;
import battlearena.heros.weapons.Weapon;

public class Main {

    public static void main(String[] args) {
        Zombie zombie = new Zombie(10, 2);
        Ogre ogre = new Ogre(20, 3);


        // zombie.battleStance();
        // ogre.stareDown();

        // battle(hero, zombie);

        Weapon weapon = new Weapon("Sword", 5);
        Hero hero = new Hero(25, 1);
        hero.setWeapon(weapon);
        hero.equipWeapon();
        heroBattle(hero, zombie);
    }

    public static void battle(Enemy e1, Enemy e2) {
        e1.talk();
        e2.talk();
        System.out.println("\t---Start---");
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
        System.out.println("\t---Final---");
        if (e1.getRemainingHealthPoints() > 0) {
            System.out.println("Enemy 1 wins!");
        }
        if (e2.getRemainingHealthPoints() > 0) {
            System.out.println("Enemy 2 wins!");
        }
    }

    public static void heroBattle(Hero hero, Enemy enemy)
    {
        System.out.println("\t---Start---");
        while (hero.getRemainingHealthPoints() > 0 && enemy.getRemainingHealthPoints() > 0)
        {
            System.out.println("\n\t-----------");
            enemy.specialAttack();
            System.out.println("\nHero: " + hero.getRemainingHealthPoints() + " HP left");
            System.out.println("\nEnemy: " + enemy.getRemainingHealthPoints() + " HP left");
            enemy.attack();
            hero.setRemainingHealthPoints(hero.getRemainingHealthPoints() - enemy.getAttackDamage());
            hero.attack();
            enemy.setRemainingHealthPoints(enemy.getRemainingHealthPoints() - hero.getAttackDamage());
        }
        System.out.println("\t---Final---");
        if (enemy.getRemainingHealthPoints() > 0) {
            System.out.println("Enemy wins!");
        }
        if (hero.getRemainingHealthPoints() > 0) {
            System.out.println("Hero wins!");
        }
    }
}
