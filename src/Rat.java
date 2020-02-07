public class Rat extends Animal {

    public Rat() {
        System.out.println("Squeek, Squueeeeek, Eeep!");
    }

    @Override
    public String sleep() {

        return "A rat sleeps in their hammock all day.....";
    }

    //polymorphism
    @Override
    public String eat() {

        return "A rat snacks on sweet potato treats....";
    }


    public String squeaks() {

        return "A rat squeaks";
    }
}
