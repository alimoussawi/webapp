package main.java.ua.nure.ostpc.third.lesson;

public class BitwiseOperator {
    public static void main(String[] args) {
        System.out.println(2 << 4); //10 1 * 2^1 + 0 * 2^1
        //10 -> 1000 1* 2 ^2  + 0 * 2^1 + 0 * 2^1
        System.out.println(32 >> 4); //10 -> 000
    }
}
