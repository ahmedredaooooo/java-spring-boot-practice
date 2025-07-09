package battlearena;

public class Weapon implements IWeapon {
    private String weaponType;
    private int attackIncrease;

    public Weapon(String weaponType, int attackIncrease) {
        this.weaponType = weaponType;
        this.attackIncrease = attackIncrease;
    }

    @Override
    public String getWeaponType() {
        return this.weaponType;
    }

    @Override
    public int getAttackIncrease() {
        return this.attackIncrease;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public void setAttackIncrease(int attackIncrease) {
        this.attackIncrease = attackIncrease;
    }
}
