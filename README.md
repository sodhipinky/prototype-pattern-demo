# 🧬 **Prototype Design Pattern**

---

## 💡 **Concept**

The **Prototype Pattern** is a creational design pattern that allows you to **clone existing objects** instead of creating new ones from scratch.

It’s especially useful when:
- Object creation is **costly** (due to DB calls, configuration, or heavy setup).
- You need **many similar objects** with small variations.
- You want to **decouple object creation** from the client.

---

## 🏗️ **Real-World Analogy**

Think of a **resume template** or a **character template** in a game.  
Instead of starting from scratch each time, you simply **copy the prototype** and modify specific details.

---

## 🧱 **Structure (UML)**

           +----------------------+
           |     Prototype        |
           |----------------------|
           | + clone(): Prototype |
           +----------^-----------+
                      |
                      |
          +-----------+------------+
          |                        |
    +---------------------+ +---------------------+
    | ConcretePrototypeA | | ConcretePrototypeB |
    |---------------------| |---------------------|
    | + clone(): Prototype| | + clone(): Prototype|
    +---------------------+ +---------------------+

---

## 🧩 **Example Scenario**

Suppose you’re developing a **game** where creating new enemies (loading models, animations, etc.) is expensive.  
Instead of creating new ones every time, you can **clone** an existing enemy prototype.

---

## 💻 **Java Implementation** (refer to the code)

### Step 1: Define the Prototype Interface
### Step 2: Create Concrete Prototype
### Step 3: Use the Prototype in Client Code


---

## 🧠 **Key Insights**


| Concept          | Description                                                            |
| ---------------- | ---------------------------------------------------------------------- |
| **Prototype**    | An existing object used as a blueprint for cloning                     |
| **Clone Method** | Creates a new object with the same state as the prototype              |
| **Advantage**    | Reduces creation cost, improves performance, simplifies initialization |


---

## 📚 Learning Resources

### 🎥 YouTube Tutorials
- [**Prototype Design Pattern in Java** – Code With Mosh](https://www.youtube.com/watch?v=AFbZhRL0Uz8)
- [**Prototype Pattern – Java Design Patterns Tutorial** by Telusko](https://www.youtube.com/watch?v=AFbZhRL0Uz8)

### 📖 Documentation & Reading
- [**Refactoring Guru:** Prototype Pattern](https://refactoring.guru/design-patterns/prototype)
- [**Baeldung:** Prototype Pattern in Java](https://www.baeldung.com/java-pattern-prototype)
- [**SourceMaking:** Prototype Design Pattern](https://sourcemaking.com/design_patterns/prototype)

---

## 🗝️ When to Use

| Situation                                                      | Use Prototype When...          |
| -------------------------------------------------------------- | ------------------------------ |
| Object creation is slow or expensive                           | ✅ Yes                          |
| You want to clone pre-configured objects                       | ✅ Yes                          |
| Objects have similar configurations but different runtime data | ✅ Yes                          |
| You only need one instance                                     | ❌ Use Singleton instead        |
| You need object families                                       | ❌ Use Abstract Factory instead |


---

## 🏁 Summary

**Prototype Pattern = Copy, Don’t Create.**

Instead of constructing a complex object from scratch, clone a pre-built prototype.
This saves time, simplifies object creation, and keeps your code flexible.

---

## 🧰 **Hands-On Challenge**
Try it yourself!

### Problem:
Build a Document management system where you can duplicate documents instead of creating new ones.

#### Tasks:

1. Create a Document interface with clone() and showDetails() methods.
2. Implement Report and Invoice classes.
3. Build a Prototype Registry that stores prototypes and returns their clones by key.
4. Print cloned documents with slight modifications.

---
