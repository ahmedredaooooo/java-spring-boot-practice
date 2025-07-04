package battlearena;

public class Enemy {
    String enemyType;
    int healthPoints = 10;
    int attackDamage = 1;

    public void talk() {
        System.out.println("I am a " + enemyType + " be prepared to fight");
    }

    public  void walkForward() {
        System.out.println("I getting closer");
    }

    public void attack() {
        System.out.println(enemyType + " attacks for " + attackDamage + " damage");
    }

    @Override
    public String toString() {
        return enemyType
                + " has " + healthPoints
                + " health points and can do an attack of "
                + attackDamage;
    }
}
