package battlearena;

public class Hero implements IHero {

    private int healthPoints;
    private int remainingHealthPoints;
    private int attackDamage;
    private boolean isWeaponEquipped = false;
    private Weapon weapon;

    public Hero(int healthPoints, int attackDamage) {
        setHealthPoints(healthPoints);
        this.attackDamage = attackDamage;
    }

    @Override
    public void equipWeapon() {
        if (getWeapon() != null && !isWeaponEquipped()) {
            setAttackDamage(getAttackDamage() + weapon.getAttackIncrease());
            setWeaponEquipped(true);
        }
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.setRemainingHealthPoints(this.healthPoints = healthPoints);
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

    @Override
    public void attack() {

    }

    @Override
    public boolean isWeaponEquipped() {
        return isWeaponEquipped;
    }

    @Override
    public void setWeaponEquipped(boolean weaponEquipped) {
        isWeaponEquipped = weaponEquipped;
    }

    @Override
    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}