//
//  name: jack tercheria
//  date: 3/19/2025
//  description: Main java file
//
public class Main {
    public static void main(String[] args) {
        Integers integers = new Integers();

        Sum sum = new Sum();

        HighestValue highestValue = new HighestValue();

        CreditCard creditCard = new CreditCard();



        integers.TwoArrays();

        sum.Sum();

        highestValue.HighestValue();

        creditCard.checkLuhn("79927398713");

        creditCard.main(args);

    }
}
