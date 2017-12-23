package ua.nure.ostpc.second.lesson;

public class NumericExamples {
    public static void main(String[] args) {
        byte max = Byte.MAX_VALUE; //127
        byte min = Byte.MIN_VALUE; // -128
//        byte sum = 127 + 127;
        byte sum = 127 - 128;
        byte sumMaxMin = Byte.MAX_VALUE + Byte.MIN_VALUE;
        int sumInt = max + max;
        long sumLong = max + max;
//        char sumChar = max + max;
        //https://www.ntu.edu.sg/home/ehchua/programming/java/images/JavaBasics_ImplicitTypeCastingPrimitives.png
        short shortA = Short.MAX_VALUE;
        short fromByte = sum;
        short maxMax = Byte.MAX_VALUE + Byte.MAX_VALUE;
        short unboxedShort = new Short(Byte.MAX_VALUE);

        int intA = 1;
        long converted = (long)Integer.MAX_VALUE;
        System.out.println(converted);
        long a = 1L;
        long maxInt = Long.MAX_VALUE + Long.MAX_VALUE + 1 + Long.MAX_VALUE + 2;
        System.out.println(Long.MIN_VALUE);
        System.out.println(maxInt == Long.MIN_VALUE);

        float floatA = Float.MAX_VALUE;
        System.out.println(floatA);
        double doubleA = Double.MAX_VALUE;
        System.out.println(doubleA);

        double doubleFloat = floatA;
        System.out.println(doubleFloat);

        long longFloat = (long) doubleFloat;
        System.out.println(longFloat);
        long charLong = '1';
        float charFloat = '1';
        double charDouble = '1';
        int val = 2 << 1; //10
        System.out.println(val);
    }
}
