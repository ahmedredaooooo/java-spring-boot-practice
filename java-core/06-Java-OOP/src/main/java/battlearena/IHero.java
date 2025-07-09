package battlearena;

public interface IHero {
    int getHealthPoints();

    int getRemainingHealthPoints();

    void setRemainingHealthPoints(int remainingHealthPoints);

    int getAttackDamage();

    Weapon getWeapon();

    void setWeapon(Weapon weapon);

    void equipWeapon();

    boolean isWeaponEquipped();

    void setWeaponEquipped(boolean isWeaponEquipped);

    void setAttackDamage(int attackDamage);

    void attack();
}