package battlearena;

public class Zombie extends Enemy {
    public Zombie(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
    }

    @Override
    public void talk() {
        System.out.println("*Grumbling...*");
    }

    @Override
    public void specialAttack() {
        boolean specialAttackEnabled = Math.random() < 0.5f;
        if (specialAttackEnabled) {
            setRemainingHealthPoints(getRemainingHealthPoints() + 6);
            System.out.println("Zombie regenerated 6 HP!");
        }
    }

    @Override
    public void attack() {
        System.out.println("Zombie attacks for " + getAttackDamage() + " damage");
    }

    public void spreadDisease() {
        System.out.println("The Zombie is trying to spread infection");
    }
}