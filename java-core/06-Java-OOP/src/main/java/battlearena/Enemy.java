package battlearena;

public class Enemy {
    String enemyType;
    int healthPoints = 10;
    int attackDamage = 1;

    @Override
    public String toString() {
        return "Enemy{" +
                "enemyType='" + enemyType + '\'' +
                ", healthPoints=" + healthPoints +
                ", attackDamage=" + attackDamage +
                '}';
    }
}
