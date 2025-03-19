//
//  name: jack tercheria
//  date: 3/19/2025
//  description: Integers java file
//
public class Integers {

    public static void TwoArrays() {
        // create the arrays
        int[] arrayOne = {73, 28, 4, 88, 61, 19, 95, 3, 52, 7};
        int[] arrayTwo = {63, 38, 19, 82, 55, 27, 91, 4, 78, 12};

        int arrayOneLength = arrayOne.length;

        int arrayTwoLength = arrayTwo.length;

        System.out.println("This is question #1");

        if (arrayOne == arrayTwo) {

            System.out.println("The two arrays are the same value");

            if (arrayOneLength == arrayTwoLength) {

                System.out.println("The arrays are the same length");

            }

            else {
                System.out.println("The arrays are not the same length");
            }
        }
        else {
                System.out.println("The arrays are not the same value");
            
                if (arrayOneLength == arrayTwoLength) {

                    System.out.println("The arrays are the same length");
    
                }
    
                else {
                    System.out.println("The arrays are not the same length");
                }
        }

        System.out.println("That is all");
    }
    
}
