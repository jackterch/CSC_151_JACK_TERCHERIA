//
//author: jack tercheria
//date: 2/5/2025
//purpose: week 4 Mammal class
//

public class Mammal {
            // properties
    protected String name;
    protected String hairColor;
    protected String eyeColor;
    protected String bodyTemp;
    protected String weight;
    protected String length;
    protected String color;

    public void Mammal(String name) {

    }

    public void GetMammalDetails(String name, String hairColor, String eyeColor, String bodyTemp, String weight, String length, String color) {
        this.name = name;
        this.hairColor = hairColor;
        this.eyeColor = hairColor;
        this.bodyTemp = bodyTemp;
        this.weight = weight;
        this.length = length;
        this.color = color;
        System.out.println("the mammal is: " + name);
        System.out.println("the hair color is: " + hairColor);
        System.out.println("the eye color is: " + eyeColor);
        System.out.println("the body temp is: " + bodyTemp);
        System.out.println("the weight is: " + weight);
        System.out.println("the length is: " + length);
        System.out.println("the color is: " + color);
    }

    // methods 
    public void setName(String name) {
        this.name = name;
        System.out.println(name + " is the new name");
    }

    public void eat() {

    }

    public void sleep() throws Exception {
        
    }

    public void scratch() {

    }

    public void walk() {

    }

    public void sit() {
        System.out.println(this.name + " is sitting down");
    }

    public void standUp() throws Exception{
        Thread.sleep(15000);
        System.out.println(this.name + " is now standing up");
        System.out.println("BARK! BARK!");
    }

    public void layDown() {

    }

    public void swim() {
        
    }

    public void drive() {

    }

}