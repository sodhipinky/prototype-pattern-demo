package pro.elevateme;

// Step 3: Use the prototype
// In the main application, create instances of the concrete prototype
// Instead of creating new instances, clone the existing ones
// This demonstrates the Prototype Design Pattern in action

import pro.elevateme.prototype.Orc;

public class Main {
    public static void main(String[] args) {
        // Create an original Orc instance
        Orc originalOrc = new Orc("Axe"); // Original Orc with an Axe

        // Clone the original object multiple times
        Orc clonedOrc1 = (Orc) originalOrc.clone();
        Orc clonedOrc2 = (Orc) originalOrc.clone();

        // Display the details of the original and cloned Orcs
        System.out.println("Original Orc Weapon: " + originalOrc.getWeapon());
        System.out.println("Cloned Orc 1 Weapon: " + clonedOrc1.getWeapon());
        System.out.println("Cloned Orc 2 Weapon: " + clonedOrc2.getWeapon());

        // Call methods on the cloned objects
        System.out.print("Orc 1 Attacks...");
        clonedOrc1.attack();

        System.out.print("Orc 2 Defends...");
        clonedOrc2.defend();

        System.out.print("Orc 1 Flees...");
        clonedOrc1.flee();

        // Show that cloned objects are separate instances
        System.out.println("Are original and clonedOrc1 the same instance? " +
                (originalOrc == clonedOrc1));   // Should be false
        System.out.println("Are clonedOrc1 and clonedOrc2 the same instance? " +
                (clonedOrc1 == clonedOrc2));    // Should be false
    }
}