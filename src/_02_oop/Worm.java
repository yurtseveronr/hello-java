package _02_oop;

public class Worm extends Animal implements Carnivorous,Cloneable {

    public Worm() {
        super();
    }

    public Worm(String name) {
        super.name=name;
    }

    @Override
    public void breathe() {
        System.out.println("I am doing cutaneous respiration");
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }

        if(this.getClass() != obj.getClass()) {
            return false;
        }

        Worm worm2 = (Worm) obj;
        return this.name == worm2.name; // you can use equals for Strings

    }

    @Override
    protected Worm clone() throws CloneNotSupportedException {
        return (Worm) super.clone();
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void eat() {
        System.out.println("I am Carnivorous");
    }
}
