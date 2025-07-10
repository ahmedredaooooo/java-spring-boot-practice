package battlearena.enemies;

public abstract class Enemy implements IEnemy {

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

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }


    @Override
    public int getRemainingHealthPoints() {
        return remainingHealthPoints;
    }

    @Override
    public void setRemainingHealthPoints(int remainingHealthPoints) {
        this.remainingHealthPoints = remainingHealthPoints;
    }

    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public static int getNumberOfEnemies() {
        return numberOfEnemies;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void specialAttack() {
        System.out.println("Enemy does not have a special attack.");
    }

    @Override
    public void talk() {
        System.out.println("I am an enemy Be prepared to fight");
    }

    @Override
    public void attack() {
        System.out.println("Enemy attacks for " + attackDamage + " damage");
    }

}