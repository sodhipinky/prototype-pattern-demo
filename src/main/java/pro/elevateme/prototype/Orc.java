package pro.elevateme.prototype;

// Step 2: Create a concrete prototype
// Implement the 'Enemy' interface in a concrete class, e.g., 'Orc'
// This class will provide the actual implementation of the methods
// and the cloning functionality

public class Orc implements Enemy {

    private int health = 100;
    private int defensePower = 50;
    private int attackPower = 75;
    private String weapon;

    public Orc(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public Enemy clone() {
        try {
            // Call Object's clone() method to create a shallow copy
            return (Enemy) super.clone();
        } catch (CloneNotSupportedException exception) {
            // If clone could not be performed, wrap it in a RuntimeException
            // This should not happen since we are Cloneable
            throw new RuntimeException("Cloning not supported for Orc", exception);
        }
    }

    @Override
    public void attack() {
        // Implementation of attack logic
        System.out.println("Orc attacks with " + weapon + " for " + attackPower + " damage!");
    }

    @Override
    public void defend() {
        // Implementation of defend logic
        System.out.println("Orc defends with " + defensePower + " defense power!");
        // Reduce health based on defense power
        health -= defensePower / 10;
        if (health < 0) {
            health = 0;
        }
        System.out.println("Orc's health is now: " + health);
    }

    @Override
    public void flee() {

    }
}
