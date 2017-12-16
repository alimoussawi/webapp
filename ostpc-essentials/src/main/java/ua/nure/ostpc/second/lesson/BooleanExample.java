package ua.nure.ostpc.second.lesson;

public class BooleanExample {
    /**
     * boolean
     * char
     * short
     * byte
     * int
     * long
     * float
     * String - non primitive but important
     * double
     * null - variable with no reference
     * https://www.javatpoint.com/images/datatype2.JPG
     */
    public static void main(String[] args) {

    }

    public static void booleanUsage() {
        boolean comparison =  isBooleanFalse() & isBooleanTrue(); //invokes both methods
        boolean singleComparison = isBooleanFalse() && isBooleanTrue(); //invokes isBoolean2 only
        boolean comparisonOrMultiple = isBooleanTrue() || isBooleanFalse(); // invokes isBooleanTrue
        boolean comparisonOr = isBooleanTrue() | isBooleanFalse(); //invokes both
    }

    public void booleanExample() {
        boolean identifier = true;
        boolean falseIdentifier = false;
        boolean comparison = 1 > 0;
        boolean compare = isBooleanTrue() && isBooleanFalse();
        boolean compareAnother = isBooleanTrue() || !isBooleanFalse();
        boolean unboxedBoolean = new Boolean(true);
        Boolean myBoxedBoolean = true;
        //        boolean a = 1;
        /*
        while(1) {
        }
         */

        while (true) {

        }
    }

    public static boolean isBooleanTrue() {
        System.out.println("Hello from true");
        return true;
    }

    public static boolean isBooleanFalse() {
        System.out.println("Hello from false");
        return false;
    }


}
