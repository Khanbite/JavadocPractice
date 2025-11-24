public class JavadocPractice {

    // ------------------------------------------------------------
    // TODO: Write a class-level Javadoc comment here.
    /**
     * The purpose of this class is to practice Javadoc.
     * It includes basic java.
     */
    // ------------------------------------------------------------



    /**
     * TODO: Write a full Javadoc block for this method.
     * This is your program's entry point. It will print a welcome message
     * and perform simple arithmetic calculations.
     * @param args command-line arguments passed to the program
     */
    public static void main(String[] args) {
        printWelcome();
        int result = add(4, 9);
        System.out.println("4 + 9 = " + result);
        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Max of 3 and 7 is " + max(3, 7));
    }


    /**
     * TODO: Write the full Javadoc block for this method.
     * Adds two integers together and returns result.
     * @param a first int
     * @param b second int
     * @return the sum of A and b
     */
    public static int add(int a, int b) {
        return a + b;
    }


    /**
     * TODO: Write the full Javadoc block for this method.
     * Checks if even
     * @param value
     * @return true or false if even
     */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }


    /**
     * TODO: Write the full Javadoc block for this method.
     * This method takes no parameters and does not return anything.
     * Prints welcome message
     */
    public static void printWelcome() {
        System.out.println("Welcome to the Javadoc practice file.");
    }


    /**
     * TODO: Write the full Javadoc block for this method.
     * Returns larger of the two integers
     * @param x first int
     * @param y second int
     * @return greater int
     */
    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }
}
