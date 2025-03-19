//
//  name: jack tercheria
//  date: 3/19/2025
//  description: Highest Value java file
//
public class HighestValue {

    public static void HighestValue() {

        // create the array
        int[] myArray = {903, 443, 881, 732, 434, 624, 875, 109, 312, 625, 891, 876, 781, 536, 713, 737, 869, 688, 666, 196, 332, 953, 422, 548, 333, 600, 534, 841, 268, 142, 847, 818, 122, 374, 698, 314, 22, 205, 270, 860, 735, 938, 888, 838, 262, 412, 460, 685, 168, 167};
        
        int max = myArray[0];

        int myArrayLength = myArray.length;

        for (int i = 1; i < myArrayLength; i++) {
            if (myArray[i] > max)
                max = myArray[i];
        }

        System.out.println("This is question #3 ");

        System.out.println("The highest value of the array is " + max);

        System.out.println("That is all");
    }
    
}
