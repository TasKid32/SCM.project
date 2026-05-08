public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Calculator!");
        System.out.println("Feature: Subtraction added!");
        System.out.println("5 - 2 = " + subtract(5, 2));
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
