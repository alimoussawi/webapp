package ua.nure.ostpc.fifth.lesson;

import java.io.IOException;

public class TestSamples {
    public static void main(String[] args) {
        new TestSamples().go();
    }

    public void ohNo() throws IOException {
        if (5 > 3) {
            throw new IllegalArgumentException();
        } else if (10 > 5) {
            throw new RuntimeException();
        }
        throw new IOException();
    }

    public Exception getException(){
        return new Exception();
    }

    public void go() {
        System.out.println("A");
        try {
            System.out.println("E");
            Object o = null;
            o.toString();
            System.out.println("F");
        } catch (ArithmeticException ex) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }

        System.out.println("D");
    }
}


