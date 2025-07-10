package battlearena.enemies;

public interface IEnemy {
    void talk();
    void attack();

    int getHealthPoints();

    int getRemainingHealthPoints();
    void setRemainingHealthPoints(int remainingHealthPoints);

    int getAttackDamage();
    void setAttackDamage(int attackDamage);

    void specialAttack();
    int getID();


}
