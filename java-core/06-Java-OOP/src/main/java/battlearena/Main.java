package battlearena;

public class Main {

    public static void main(String[] args) {
        Enemy zombie = new Enemy();

        zombie.setEnemyType("Zombie");

        System.out.println(zombie + "\n");

        zombie.talk();

        zombie.walkForward();

        zombie.attack();
    }
}
