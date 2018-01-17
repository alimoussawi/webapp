package ua.nure.ostpc.fifth.lesson;

import java.io.IOException;

class MyOwnThrowable extends StackOverflowError {
}

public class BasicException {
    public static void main(String[] args) {
        try {
            cashInsert();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            cashBack();
        } finally {
            cashFeedback();
        }
    }

    private static void cashInsert() {
        System.out.println("cash inserted");
        cashProcess();
    }

    private static void cashProcess() {
        System.out.println("process started");
//        raiseError();
        System.out.println("process finished");
    }

    private static void raiseError() {
        throw new NumberFormatException("Your money are old enough");
    }

    private static void cashFeedback() {
        System.out.println("operation complete");
    }

    private static void cashBack() {
        System.out.println("cash back");
    }

    private static int getItemFromArray(int[] array, int index) {
        return array[index];
    }

    private static void throwException(String argument) {
        if (argument.equals("1")) {
            System.out.println("Hello");
        } else {
            throw new MyOwnThrowable();
        }
    }
}
