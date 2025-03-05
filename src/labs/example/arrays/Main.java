// 
//  name: jack tercheria
//  date: 3/3/2025
//  description: Main.java
//
public class Main {
    public static void main(String[] args) {
        ArrayOperations arrayopperations = new ArrayOperations();
        BubbleSort bubbleSort = new BubbleSort();

        // array operations display array
        arrayopperations.DisplayArray(10);

        // buuble sort
        int a[] = {605, 632, 273, 317, 349, 277, 998, 268, 628, 608, 683, 989, 871, 646, 966, 678, 785, 165, 28, 946, 411, 484, 603, 875, 369, 358, 894, 988, 114, 276, 920, 688, 548, 750, 204, 724, 524, 135, 980, 350, 324, 521, 768, 720, 52, 139, 253, 119, 127, 859};
        bubbleSort.bubbleSort(a);

        
        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.println(a[i] + " ");
        System.out.println("That is all");

        // get days and months
        arrayopperations.displaysGetDaysAndMonths();
    }
}