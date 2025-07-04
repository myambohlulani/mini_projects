// package Java;

public class Functions {
    /*
     * def nameOfTheFunction():
     * code-block
     *
     * Methods are functions within the class.
     * They group statements together and reuse those statements.
     */
    private static void myFunction2() {
        System.out.println("Hello, I am from the static method!");
    }

    public static void main(String[] args) {
        Functions myObject = new Functions();

        // methods without parameters
        myObject.myFuntion();
        myFunction2();
        myFunction2();

        int myAddition = addition();
        System.out.println(myAddition);

        System.out.println(myStrings());
        System.out.println(myPI());
        System.out.println(myBoolean());

        // methods with parameters
        printHelloWorld("Hello, World! I am coding in java!");

        int firstSum = getSum(10, 10);
        double secondSum = getSum(10.12, 10.11);
        double thirdSum = getSum(19.99, 10, 19.11);
        int fourthSum = getSum(10, 11, 12);

        System.out.println(firstSum);
        System.out.println(secondSum);
        System.out.println(thirdSum);
        System.out.println(fourthSum);

        // String[] names = getNames("Hlulani", "Ntokoto", "Vulombe", "Ndzhaka");
        // for (String[] name : names) {
        // System.out.println(name);
        // }
        System.out.printf("Hello World! %.2f%n.%n", 1978218.21818991);
        System.out.printf("Hello World!2");
    }

    // access-modifier non-access modifier return-type nameOTheMethod(parameters) {}
    public void myFuntion() {
        System.out.println("Hello, World. I am from non-static method!");
    }

    // methods without parameters and they are static
    public static int addition() {
        return 1 + 2;
    }

    private static String myStrings() {
        return "Hello, World!";
    }

    private static boolean myBoolean() {
        return true;
    }

    private static double myPI() {
        return 3.141;
    }

    // methods with parameters and are still static
    private static void printHelloWorld(String name) {
        System.out.println(name);
        return;
    }

    // methods overloading => Using the same name of the method but with different
    // parameters
    private static int getSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int getSum(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    private static double getSum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    private static double getSum(double firstNumber, double secondNumber, double thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public static String[] getNames(String... names) {
        return names;
    }
}
