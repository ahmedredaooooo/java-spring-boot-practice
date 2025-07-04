package battlearena;

public class Main {

    public static void main(String[] args) {
        Zombie zombie = new Zombie(10, 1);
        Ogre ogre = new Ogre(20, 3);

        zombie.talk();
        zombie.spreadDisease();

        ogre.talk();

        System.out.println("IDs:");
        System.out.println(zombie.getID());
        System.out.println(ogre.getID());

        System.out.println("Number of Enemies:");
        System.out.println(zombie.getNumberOfEnemies());
        System.out.println(ogre.getNumberOfEnemies());
    }
}
