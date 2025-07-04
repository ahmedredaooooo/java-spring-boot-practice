package battlearena;

public class Ogre extends Enemy{
    public Ogre(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
    }

    @Override
    public void talk() {
        System.out.println("Ogre is slamming hands all around.");
    }

    @Override
    public void specialAttack() {
        boolean specialAttackEnabled = Math.random() < 0.2f;
        if (specialAttackEnabled) {
            setAttackDamage(getAttackDamage() + 3);
            System.out.println("Orge power increased by 3 points!");
        }
    }
    @Override
    public void attack() {
        System.out.println("Orge attacks for " + getAttackDamage() + " damage");
    }
}
