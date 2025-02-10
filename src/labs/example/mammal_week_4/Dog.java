public class Dog extends Mammal {

    public void GetName(String name) {
        this.name = name;
    }

    public void Bark() {
        System.out.println();
        System.out.println("BARK!  BARK!");
    }

    public void Fetch() throws Exception{
        System.out.println("run");
        Thread.sleep(5000);
        System.out.println("*find item*");
        System.out.println("run back");
    }

    public void layDown() {
        System.out.println(this.name + " is laying down");    
    }

    public void Swim() {
        
    }

    public void Scratch() {

    }
}
