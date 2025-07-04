package battlearena;

public interface IEnemy {
    public void talk();
    public void attack();

    public int getHealthPoints();
    public void setHealthPoints(int healthPoints);

    public int getRemainingHealthPoints();
    public void setRemainingHealthPoints(int remainingHealthPoints);

    public int getAttackDamage();
    public void setAttackDamage(int attackDamage);

    public void specialAttack();
    public int getID();


}
