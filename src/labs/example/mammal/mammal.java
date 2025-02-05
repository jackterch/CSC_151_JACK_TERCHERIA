package labs.example.mammal;

public class Mammal {
        // properties
    protected String name;
    protected String hairColor;
    protected String eyeColor;
    protected String bodyTemp;
    protected String weight;
    protected String length;
    protected String color;

    // constructor 
    public void Mammnal(String name) {
        name = "jack";
        hairColor = "brown";
        eyeColor = "blue";
        bodyTemp = "98.6 F";
        weight = "150 lbs";
        length = "72 inches";
        color = "green";
    }
    // methods 
    public void setName(String name) {
        this.name = name; 
    }

    public void run(String name) {
        
    }

    public void eat() {
        System.out.println("The" + this.name + "is eating");
    }

    public void sleep() {

    }

    public void scratch() {

    }

    public void walk() {

    }

    public void sit() {

    }

    public void layDown() {

    }

    public void swim() {
        
    }

    public void drive() {

    }
}
