

public class Main {
    public static void main(String[] args) throws Exception {
        Mammal mammal = new Mammal();
        Dog dog = new Dog();

        mammal.GetMammalDetails("jack", "brown", "blue", "98.6 F", "150Lbs", "5feet 8inches", "green");
        mammal.setName("bear");
        mammal.sit();
        mammal.standUp();
        dog.GetMammalDetails("dog", "brown", "brown", "100 F", "20 Lbs", "2 feet", "brown");
        dog.setName("cactus");
        dog.Bark();
        dog.Fetch();
        dog.layDown();
    }
}
