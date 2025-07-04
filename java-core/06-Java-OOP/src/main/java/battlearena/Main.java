package battlearena;

public class Main {

    public static void main(String[] args) {
        Zombie zombie = new Zombie(10, 1);
        Ogre ogre = new Ogre(20, 3);

        zombie.talk();
        zombie.spreadDisease();

        ogre.talk();

    }
}
