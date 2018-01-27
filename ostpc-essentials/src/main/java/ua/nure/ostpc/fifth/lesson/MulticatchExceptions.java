package ua.nure.ostpc.fifth.lesson;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MulticatchExceptions {
    public long a = 1_000_000_000_00L;

    public MulticatchExceptions() {

    }

    public void MulticatchExceptions() {

    }

    public static void main(String[] args) {
        int a;
        System.out.println(new MulticatchExceptions().a);
//        System.out.println(a);
        try {
            raiseArithmeticException(); //ArythmeticException
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Hello Heshmat!!");
            try {
                raiseIndexOutOfBoundException();
            } catch (ArrayIndexOutOfBoundsException iobEx) {
                System.out.println("Inner catch array iob");
            } finally {
                System.out.println("my own inner finally");
            }
        } catch (ArrayIndexOutOfBoundsException iobEx) {
            System.out.println("Array index out of bound exception ");
        } catch (IndexOutOfBoundsException iob) {
            System.out.println("Index out of bound exception");
        } catch (Exception ex) {
            ex.printStackTrace();
        } catch (Error err) {
            System.out.println("Error");
        } catch (Throwable ex) {
            System.out.println("Throwable");
        } finally {
            System.out.println("finally");
        }
    }

    public static void raiseArithmeticException() {
        int a = 10 / 0;
    }

    public static void iDontKnowHowTo() {
        throw new NotImplementedException();
    }

    public static void raiseIndexOutOfBoundException() {
        int[] a = new int[0];
        int b = a[100];
    }


}
