public class Dog extends Animal {

    public Dog() {
        System.out.println("Dogs are the best humans...");
    }

    @Override
    public String sleep() {

        return "A dog snoozles deeply....";
    }

    //polymorphism
    @Override
    public String eat() {

        return "A dog eats messily...";
    }


    public String bork() {

        return "A dog borks in at the cat";
    }

}
