

public class Main {
    public static void main(String[] args) throws Exception {
        Mammal mammal = new Mammal();
        Dog dog = new Dog();

        mammal.GetMammalDetails("jack", "brown", "blue", "98.6 F", "150Lbs", "5feet 8inches", "green");
        mammal.setName("bear");
        mammal.sit();
        mammal.standUp();
        dog.Bark();
        dog.Fetch();
    }
}
