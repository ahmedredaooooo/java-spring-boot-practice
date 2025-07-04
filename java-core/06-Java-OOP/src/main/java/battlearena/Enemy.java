package battlearena;

public class Enemy {

    private int id;
    private int healthPoints;
    private int remainingHealthPoints;
    private int attackDamage;
    private static int numberOfEnemies;

    public Enemy() {
        this.id = ++numberOfEnemies;
    }

    public Enemy(int healthPoints, int attackDamage) {
        this.remainingHealthPoints = this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
        this.id = ++numberOfEnemies;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getRemainingHealthPoints() {
        return remainingHealthPoints;
    }

    public void setRemainingHealthPoints(int remainingHealthPoints) {
        this.remainingHealthPoints = remainingHealthPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public static int getNumberOfEnemies() {
        return numberOfEnemies;
    }

    public int getID() {
        return id;
    }

    public void specialAttack() {
        System.out.println("Enemy does not have a special attack.");
    }

    public void talk() {
        System.out.println("I am an enemy Be prepared to fight");
    }

    public void walkForward() {
        System.out.println("I am getting closer");
    }

    public void attack() {
        System.out.println("Enemy attacks for " + attackDamage + " damage");
    }

}