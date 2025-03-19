// 
//  name: jack tercheria
//  date: 3/19/2025
//  description: Sum java file
//
public class Sum {
    public static void Sum() {
        int[] arrayOne = {47, 45, 74, 54, 31, 59, 88, 14, 8, 29, 76, 2, 91, 35, 83, 63, 66, 90, 24, 23, 15, 26, 61, 87, 60};
        int[] arrayTwo = {79, 15, 10, 54, 48, 27, 65, 14, 95, 84, 21, 81, 7, 18, 38, 16, 33, 70, 30, 68, 12, 96, 62, 82, 49};
        int[] arrayThree = {29, 47, 20, 14, 69, 44, 51, 5, 78, 37, 39, 98, 83, 46, 70, 24, 79, 90, 4, 6, 91, 7, 61, 26, 8};
    
        int arrayOneLength = arrayOne.length;
    
        int arrayTwoLength = arrayTwo.length;
    
        int arrayThreeLength = arrayThree.length;
    
        double arrayOneSum = 0;

        double arrayTwoSum = 0;

        double arrayThreeSum = 0;
    
        int i;
    
        for (int number : arrayOne)
            {
                arrayOneSum += number;
            }

        for (int number : arrayTwo)
            {
                arrayTwoSum += number;
            }
        for (int number : arrayTwo)
            {
                arrayThreeSum += number;
            }

        System.out.println("This is question #2");

        System.out.println("Array value one " + arrayOneSum);
        System.out.println("Array value two " + arrayTwoSum);
        System.out.println("Array value three " + arrayThreeSum);

        if (arrayOneSum > arrayTwoSum && arrayOneSum > arrayThreeSum) {
            System.out.println("Array number 1 is the largest array with a value of: " + arrayOneSum);
        }

        if (arrayTwoSum > arrayOneSum && arrayTwoSum > arrayThreeSum) {
            System.out.println("Array number 2 is the largest array with a value of: " + arrayTwoSum);
        }

        else if (arrayThreeSum > arrayOneSum && arrayThreeSum > arrayTwoSum) {
            System.out.println("Array number 1 is the largest array with a value of: " + arrayThreeSum);
        }

        System.out.println("That is all");

       
    }
}
