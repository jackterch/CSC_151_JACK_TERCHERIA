// 
//  name: jack tercheria
//  date: 2/24/2025
//  description: main.java
//
public class Main {
    public static void main(String[] args) {

        WhileLoop whileLoop = new WhileLoop();
        ForLoop forLoop = new ForLoop();

        whileLoop.CallExecuteWhileLoop();
        forLoop.CallExecuteForLoop();
        forLoop.CallSumTwoNumber(10, 10);
        forLoop.CallSumLoopCounter(10);
        forLoop.CallPrintMultiplicationTable();
    }
}