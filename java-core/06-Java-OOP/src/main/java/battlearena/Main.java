package battlearena;

public class Main {

    public static void main(String[] args) {
        Enemy zombie = new Enemy("Zombie", 10, 1);

        Enemy ogre = new Enemy("Ogre", 20, 3);

        zombie.talk();

        ogre.talk();

    }
}
