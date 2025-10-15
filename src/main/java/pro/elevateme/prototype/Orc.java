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
}
