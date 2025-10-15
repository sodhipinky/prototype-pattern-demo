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
    }
}