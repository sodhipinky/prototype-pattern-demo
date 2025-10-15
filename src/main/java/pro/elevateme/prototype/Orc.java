package pro.elevateme.prototype;

// Step 2: Create a concrete prototype
// Implement the 'Enemy' interface in a concrete class, e.g., 'Orc'
// This class will provide the actual implementation of the methods
// and the cloning functionality

public class Orc implements Enemy {

    private int health = 100;
    private String weapon;
    private int attackPower;
    private int defensePower;

    public Orc(String weapon, int attackPower, int defensePower) {
        this.weapon = weapon;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
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
        return null;
    }

    @Override
    public void attack() {

    }

    @Override
    public void defend() {

    }

    @Override
    public void flee() {

    }
}
