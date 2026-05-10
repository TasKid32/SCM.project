public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Calculator!");
        System.out.println("Feature: ADDITION");
        System.out.println("2 + 3 = " + add(2, 3));
        System.out.println("Feature: SUBTRACTION");
        System.out.println("5 - 2 = " + subtract(5, 2));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
