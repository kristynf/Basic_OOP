/*
 * All Cats are Animals but all Animals are not Cats
 */
//this is inheritance
public class Cat extends Animal {

    public Cat() {
        super();
        System.out.println("Now I am a Cat!");
    }

    //these overrides are an example of polymorphism
    @Override
    public String sleep() {
        return "A cat sleeps...";
    }

    @Override
    public String eat() {
        return "A cat eats...";
    }

    public String purr() {
        return "purrr...";
    }

}
