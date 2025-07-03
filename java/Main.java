package java;

import java.util.Arrays;
// import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    // Access Modifier: public, private, default, protected
    // main method => Entry point of your program

    /*
     * Everytime you make an attribute final, it must be in capital letters.
     * Naming classes must follow PascalCase.
     * Naming variables / methods you must you camelCase.
     *
     * literals => fixed values within your program.
     */
    public final int AGE = 19;

    public static void main(String[] args) {
        // Variables => containers for data.
        // primitive data types or reference data type.
        // 8 primitives
        // int, long, double, byte, short, float, boolean, char
        // 6 numerics and 2 non-numerics.

        // (access-modifier) (non-access modifier) (data-type) name = value;
        // declare the variable and initializing the variables

        // = => assignment operator, 4 bytes of memory => 32 bits
        // [-4294967296,4294967295]
        int age = 2025;
        System.out.println(age);

        // long 8 bytes of memory => 64 bits
        long number = 900L;
        System.out.println(number);

        // byte => 1 byte => 8 bits [-128, 127]
        byte myNumber = 127;
        System.out.println(myNumber);

        // short => 2 bytes => 16 bits [-65537, 65535]
        short myShortNumber = 1990;
        System.out.println(myShortNumber);

        // decimals

        // float => 4 bytes => 32 bits [-4billion, 4 billion]
        final float EULER = 3.14159265358979F;

        // double => 8 bytes => 64 bits [-1 trillion, 1 trillion]
        final double PI = 3.14159265358979;

        System.out.println(EULER);
        System.out.println(PI);

        long myPi = (long) 3.54159265358979;
        System.out.println(myPi);

        // Non-numerics
        // boolean => 1 byte => 8 bits => true or false
        boolean isCold = true;
        boolean didLaundry = false;
        boolean isFriday = false;
        boolean ateFish = true;

        System.out.println(isCold);
        System.out.println(didLaundry);
        System.out.println(isFriday);
        System.out.println(ateFish);

        // char => 2 bytes => 16 bits => Stores single characters.
        char myInitial = 'N';
        char currency = '$';
        char southAfricanCurrency = 'R';
        System.out.println(myInitial);
        System.out.println(currency);
        System.out.println(southAfricanCurrency);

        System.out.println('a' + 'b'); // 195
        System.out.println('a' + "b"); // ab
        System.out.println("a" + 'b'); // ab
        System.out.println(1 + 'a'); // 98
        System.out.println(1 + "a"); // 1a
        System.out.println("a" + 1 + 2); // a12
        System.out.println("a" + (1 + 2)); // a3

        // Everytime you do Arithmetic or Expressions, You must follow BODMAS.

        // Wrapper classes => primitives but as objects, to add more functionalities.
        // int => Integer
        // boolean => Boolean
        // char => Character
        // short => Short
        // long => Long
        // double => Double
        // float => Float

        Integer mySecondNumber = 10;
        Short myShort = 190;
        Long myLong = 19328721L;
        Boolean myBoolean = true;
        Float myFloat = 19.99F;
        Double myDouble = 1111.1111;
        Character myChar = 'H';
        Byte myByte = 100;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myChar);
        System.out.println(myLong);
        System.out.println(myBoolean);
        System.out.println(mySecondNumber);
        System.out.println(myFloat);
        System.out.println(myDouble);

        // ARITHMETICS, can only be done with numerics.

        // += addition augmented operator -=, /=, *=, % => modulus
        // variable++ => store the value then add by 1, ++variable => add by 1 then
        // store the value.
        // variable-- => store then subtract by 1, --variable => subtract by 1 then
        // store
        // the value.

        int myTestNumber = 198921;
        System.out.println(myTestNumber == myTestNumber++); // true
        myTestNumber--;
        System.out.println(myTestNumber == ++myTestNumber); // false

        float myNumberInDecimal = (float) 10 / 2;
        int myNumberAsWhole = 10 / 2;
        System.out.println(myNumberInDecimal);
        System.out.println(myNumberAsWhole);

        // casting => conversion from one primitive data-type to another data-type.
        // smallest to largest => up-casting / widening casting. it is done
        // automatically
        // largest to smallest => down-casting / narrowing casting. it is done manually.
        System.out.println(10 / (int) 2.25);

        int ageAsDecimal = (int) 18.89;
        double ageInDecimalFormat = 19;
        System.out.println(ageAsDecimal);
        System.out.println(ageInDecimalFormat);

        /*
         * double -> float -> long -> int -> short -> byte: down casting / Narrowing.
         * byte -> short -> int -> long -> float -> double: up-casting / Widening.
         */

        // FLOW-CONTROL: if-statements, for-loops, while loops and do-while loops,
        // switch, ternary operators, for-each loops.

        /*
         * if (condition) {
         * //code-block
         * } else if (condition) {
         *
         * }
         * else {}
         *
         * SYMBOLS TO KNOW:
         * 1. && => (AND operator) => in python it is known as and.
         * 2. || => Pipe(OR operator) => in python it is known as or.
         * 3. ! => Negation Operator.
         */

        if (!!!!!!!(18 == age && true)) {
            System.out.println("Hello, World!");
        }
        // coding like yoda
        // value == nameOfVariable

        // do not code like this psycho.
        if (18 == age) {

        }

        /*
         * For-loop in python: for i in range(start, end, step): => Normal for-loop
         * for i in iterable: => for-each loop.
         * while loop in python is the same as the while loop in java.
         * do-while loop -> runs at least once.
         * switch => same thing as one in python.
         */

        // syntax of for-loop
        // for(start; end; step) {
        // }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // print and printf
        System.out.print("Hello, World!");

        String name = "Ntokoto";
        // format string in python
        System.out.printf("\nHello my name is %s and i am %d years old!", name, age);
        /*
         * placeholders:
         * 1. %s => Strings only
         * 2. %d => integers/ long/ short/ byte numbers only
         * 3. %f => decimals only
         * 4. %c => characters(char) only
         * 5. %b => boolean only
         */

        System.out.printf("\nIs today raining: %b.", false);
        System.out.printf("\nThe value of pi %.2f.", 3.14559);
        System.out.printf("\nHello my initial is %c.", myInitial);

        System.out.println();
        // while loops
        // while (condition) {code-block}
        int myNumberInLoop = 0;
        while (myNumberInLoop <= 10) {
            ++myNumberInLoop;
            System.out.println(myNumberInLoop);
        }

        String weather = "Rain";

        // switch uses time-complexity of O(1) just like a dictionary
        switch (weather.toLowerCase()) {
            case "sunny":
                System.out.println("Today is sunny!");
                break;
            case "cloudy":
                System.out.println("Today is cloudy!");
                break;
            case "windy":
                System.out.println("Today is windy.");
                break;
            case "snowing":
                System.out.println("Today is Snowing.");
                break;
            case "cold":
                System.out.println("Today is Cold!");
                break;
            default:
                System.out.println("You chose incorrect weather.");
        }

        // enhanced version of switch and is recommended for use
        switch (weather.toLowerCase()) {
            case "sunny" -> System.out.println("Today is sunny!");
            case "cloudy" -> System.out.println("Today is cloudy!");
            case "windy" -> System.out.println("Today is windy.");
            case "snowing" -> System.out.println("Today is Snowing.");
            case "cold" -> System.out.println("Today is Cold!");
            default -> System.out.println("Weather not found!");
        }

        System.out.println('a'); // a
        char characterA = 'a';
        System.out.println(characterA); // a
        System.out.println((int) characterA + "a"); // 97a
        System.out.println(characterA + 'a'); // 194
        System.out.println(characterA + "a"); // aa

        // getting all english alphabets in lower caps
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i); // abc...z
        }

        System.out.println();

        char myIndex = 'A';

        // getting all english alphabets in upper caps
        while (myIndex <= 'Z') {
            System.out.print(myIndex);
            myIndex++;
        }

        // do-while loop => runs atleast once
        System.out.println();
        int count = 0;
        do {
            System.out.println("Hello, world! x" + count);
            count++;
        } while (count < 0);

        // Arrays => is an object that stores data of the same type.
        // You cannot change it's size once created.
        // data-type[] nameOfYourIdentifier = new data-type[size];

        int[] decimals = new int[10]; // default values for integers is 0

        for (int i = 0; i <= decimals.length - 1; i++) {
            decimals[i] = (i + 2) * 5;
        }

        System.out.println(Arrays.toString(decimals));

        // resizing the array
        int decimalsResizing[] = new int[20];
        for (int i = 0; i < decimals.length; i++) {
            decimalsResizing[i] = decimals[i];
        }

        decimals = decimalsResizing;

        System.out.println(decimals + " " + decimalsResizing);
        decimalsResizing = null;

        System.out.println(decimals + " " + decimalsResizing);
        System.out.println(Arrays.toString(decimals));
        System.out.println(Arrays.toString(decimalsResizing));

        int[] myArray = { 10, 11, 12, 13 };
        System.out.println(Arrays.toString(myArray));
        System.out.println(myArray.length);

        String name2 = "Hlulani Myambo";
        System.out.println(name2.length());

        // if you use collections, there is no need for you to use Arrays.toString since
        // it has it already and overriden it.

        int[][] myMatrix = { { 10, 11 }, { 90, 190 } };
        System.out.println(Arrays.deepToString(myMatrix));

        // ArrayList => adjustable array
        // Syntax of ArrayList
        // ArrayList<Wrapper Class> nameOfTheCollection = new ArrayList<>();
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1990); // this line is how you add values within your collection
        // myArrayList.add("Hello"); this will raise an exception
        for (int i = 0; i <= 10; i++) {
            myArrayList.add(i, (i + 2) * 5);
        }

        System.out.println(myArrayList);
        System.out.println(myArrayList.size()); // length of a collection

        // HashMap<Integer, String> helloWorld = new HashMap<>();
        // helloWorld.put(18, "My birthday");
        // System.out.println(helloWorld);

        String[] names = { "Ntokoto", "Hlulani", "Apple", "Orange", "Banana", "PineApple", "Vulombe", "Water Melon",
                "Bees", "UCT" };
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ", ");
        }

        System.out.println();
        // for-each loop

        // for i in names: in python
        for (String i : names) {
            System.out.print(i + ", ");
        }

        /*
         * Use a normal for-loop if you want to change values within the array.
         * Use for-each loop if you just want to output the elements within the array.
         */
    }
}
