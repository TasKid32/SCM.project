public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Calculator!");
        
        System.out.println("Feature: Addition added!");
        System.out.println("2 + 3 = " + add(2, 3));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
