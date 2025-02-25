public class Main {
    public static void main(String[] args) {

        WhileLoop whileLoop = new WhileLoop();
        ForLoop forLoop = new ForLoop();

        whileLoop.executeWhileLoop();
        forLoop.executeForLoop();
        forLoop.sumTwoNumbers(10);
        forLoop.sumLoopCounter(10);
        forLoop.printMultiplicationTable();
    }
}