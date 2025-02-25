public class ForLoop {

    public static void executeForLoop() {
        int number;

        for (number = 1; number <= 20; number++) 
        {
            System.out.println("Execute 20 times " + number);
        }

        System.out.println("That is all!");
    }

    public static void sumTwoNumbers(int maximum) {
        int number;

        for (number = maximum; number >= 1; number--)
        {
            int sum;

            sum = number + number;

            System.out.println("Sum of number " + number + " + " + number + " = " + sum);
        } 

        System.out.println("That is all");
    }

    public static void sumLoopCounter(int maximum) {

        int number;

        for (maximum = 0; maximum <= 10; maximum++) {
            System.out.println("The integer is " + maximum + " will execute til 10");
        }

        System.out.println("That is all");
    }

    public static void printMultiplicationTable() {
        int number;

        for (number = 1; number <= 12; number++)
        {
            int multiply;

            multiply = number * number;

            System.out.println("The product of " + number + " * " + number + " = " + multiply);
        }

        System.out.println("That is all");
    }
}
