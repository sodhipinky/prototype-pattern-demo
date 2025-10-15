package pro.elevateme.prototype;

// Step 1: Create the 'Enemy' interface and make it 'Cloneable'
// Extend the 'Cloneable' interface to indicate that we want to allow cloning
// 'Cloneable' is a marker interface, it does not contain any methods
public interface Enemy extends Cloneable {

    Enemy clone();          // Method to clone the object

    void attack();          // Method to perform an attack

    void defend();          // Method to perform a defense action

    void flee();            // Method to flee from battle
}
