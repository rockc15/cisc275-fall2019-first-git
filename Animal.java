package cisc275_spring2020_first_git;

public class Animal {
    String name;
    int legs;

    public Animal(String name, int legs) {
        this.legs = legs;
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public String toString() {
        return "Name: " + name + " legs: " + legs;
    }

}