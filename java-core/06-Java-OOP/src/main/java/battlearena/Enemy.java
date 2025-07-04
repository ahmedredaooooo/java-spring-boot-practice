package battlearena;

public class Enemy {

    private String enemyType;
    private int healthPoints;
    private int attackDamage;

    public Enemy(String enemyType, int healthPoints, int attackDamage) {
        this.healthPoints = healthPoints;
        this.enemyType = enemyType;
        this.attackDamage = attackDamage;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

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
