/*
 * This is the parent class. Also called the super class
 */
public class Animal {
    public Animal() {
        System.out.println("A new animal has been created!");
    }
    public String sleep() {
        return "An animal sleeps...";
    }
    public String eat() {
        return "An animal eats...";
    }
}


 /* What just happened? Comment your understanding of object-oriented programming from the four classes created above.
 Where is the method executing encapsulation? Inheritance? Or polymorphism?

Create 2 more animal classes (i.e. Dog, Mouse, etc.) and extend the animal class to verify your understanding.*/