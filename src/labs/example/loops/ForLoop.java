// 
//  name: jack tercheria
//  date: 2/24/2025
//  description: ForLoop.java
//
public class ForLoop {

    public static void executeForLoop() {
        int number;

        for (number = 1; number <= 20; number++) 
        {
            System.out.println("Execute 20 times " + number);
        }

        System.out.println("That is all");
    }

    public static void sumTwoNumbers(int valueOne, int valueTwo) {
        int number;

        for (number = valueOne; number >= 1; number--)
        {
            int sum;

            sum = valueOne + valueTwo;

            System.out.println("Sum of number " + valueOne + " + " + valueTwo + " = " + sum);

            valueOne--;

            valueTwo--;
        } 

        System.out.println("That is all");
    }

    public static void sumLoopCounter(int maximum) {

        int number;

        for (number = 1; number <= maximum; ++number) 
        {
            System.out.println("The count is " + number + " will execute til " + maximum);
        }

        System.out.println("The sum of the loop counter is " + maximum);

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
