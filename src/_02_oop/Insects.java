package _02_oop;

public class Insects extends Animal implements Carnivorous{

    public Insects() {
        super();
    }

    public Insects(String name) {
        this();
        super.name = name;
    }


    @Override
    public void breathe() {
        System.out.println("I am doing treachery respiration");
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }

    @Override
    public void eat() {
        System.out.println("I am Carnivorous");
    }
}
