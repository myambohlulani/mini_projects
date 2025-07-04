public class Stringss {
    /*
     * Strings are immutable meaning once created, cannot be changed.
     * When you create a new string without using the keyword new, the strings will
     * reference to the same object if they have the same value.
     * == checks for the memory.
     * equals method checks for the values.
     */

    public static void main(String[] args) {
        // stored within heap memory in the string pool
        String name = "Ntokoto";
        String name2 = "Ntokoto";
        System.out.println(name == name2); // true
        System.out.println(name.equals(name2)); // true

        // They are stored in heap memory but outside the string pool
        String name3 = new String("Ntokoto");
        String name4 = new String("Ntokoto");

        System.out.println(name3 == name4); // false
        System.out.println(name3.equals(name4)); // true
        System.out.println((name4 == name2) + " " + (name == name4)); // false false

        System.out.println(name3.equals(name4)); // true

        // Allows us to creates mutable strings
        // with these we do not create a new string each time but we modify a certain
        // string
        // StringBuffer => Thread safe.
        // StringBuilder => Not Thread safe.

        // creating a new object of String
        // waste of memory, which costs space complexity.
        name3 = "Ntk";
        name3 = "Ntokoz";

        // creating an object of the String Buffer and String Builder
        StringBuffer myBuffer = new StringBuffer("Hello My name is ");
        StringBuilder myBuilder = new StringBuilder("Hello i am ");
        // adding values
        myBuffer.append("Ntokoto.");
        myBuilder.append("18 years old!");
        System.out.println(myBuffer);
        System.out.println(myBuilder);

        System.out.println(myBuffer.charAt(0));
        // if you insert one number it becomes a start, last index is excluded
        System.out.println(name.substring(1, name.length())); // if you put numbers outof bound, error will be raised
        // System.out.println(name);
        System.out.println(myBuffer.capacity());
        System.out.println(myBuffer);
    }
}
