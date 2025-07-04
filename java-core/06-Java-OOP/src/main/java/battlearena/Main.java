package battlearena;

public class Main {

    public static void main(String[] args) {
        Enemy zombie = new Enemy("Zombie", 10, 1);

        System.out.println(zombie + "\n");

        zombie.talk();

        zombie.walkForward();

        zombie.attack();
    }
}
