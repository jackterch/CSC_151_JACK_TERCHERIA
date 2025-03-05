// 
//  name: jack tercheria
//  date: 3/3/2025
//  description: ArrayOperations.java
//
public class ArrayOperations {

    public static void createNewArray(int valueOne) {
        int[] arrayOne = new int[valueOne];

        for (int index = 1; index <= valueOne; index++) 
        {
            System.out.println("The value for this index is " + index + "");
        }
        System.out.println("I created a new array and it has " + valueOne + " elements in it");
        System.out.println("That is all");
    }

    public static void DisplayArray(int valueOne) {
        createNewArray(valueOne);
    }

    public static void getDaysAndMonths() {
        int[] days = {31, 28, 31, 30, 31, 30,
                      31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int index = 0; index < 12; index++)
        {
            System.out.println(months[index] + " has " + days[index] + " days");
        }
        System.out.println("That is all");
    }

    public static void displaysGetDaysAndMonths() {
        getDaysAndMonths();
    }

}
