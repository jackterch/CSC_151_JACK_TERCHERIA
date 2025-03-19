//
//  name: jack tercheria
//  date: 3/19/2025
//  description: Credit Card java file
//
public class CreditCard {
    static boolean checkLuhn(String cardNo)
    {
    int numberDigits = cardNo.length();
 
    int nSum = 0;
    boolean isSecond = false;
    for (int i = numberDigits - 1; i >= 0; i--) 
    {
 
        int d = cardNo.charAt(i) - '0';
 
        if (isSecond == true)
            d = d * 2;
 
        nSum += d / 10;
        nSum += d % 10;
 
        isSecond = !isSecond;
    }
    return (nSum % 10 == 0);
}
    static public void main (String[] args)
    {
        System.out.println("This is question #4");

        String cardNo = "79927398713";
        if (checkLuhn(cardNo))
            System.out.println("This is a valid card");
        else
            System.out.println("This is not a valid card");

        System.out.println("That is all");
    }
}
