package basic;

public class functions_methods {
    public static void printJava() {
        System.out.println("Hello Java");
    }
    public static void printName(String name) {
        System.out.println(name);
    }
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        //METHODS
        printJava();
        printName("Hello");
        printName("World");
        printSum(1, 9);
    }
}
