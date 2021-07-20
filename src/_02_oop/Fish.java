package _02_oop;

public class Fish extends Animal implements Herbivorous{



    public Fish() {
        super();
    }

    public Fish(String name) {
        this();
        super.name = name;
    }


    @Override
    public void breathe() {
        System.out.println("I am doing gill respiration");
    }

    @Override
    public void walk() {
        System.out.println("I am swimming");
    }

    @Override
    public void eat() {
        System.out.println("I am Herbivorous");
    }
}



