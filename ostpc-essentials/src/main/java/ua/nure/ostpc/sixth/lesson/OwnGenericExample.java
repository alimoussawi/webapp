package ua.nure.ostpc.sixth.lesson;

import java.io.FileNotFoundException;

interface Comparable {
    int compareTo(Object o);
}

interface Command<T> {
    void doSomething();
}

abstract class AbstractCommand implements Command {
    abstract void doAnother();
}
class GenExample<T> {
    private T value;
    public boolean doComparison(T o) {
        return false;
    }
}
public class OwnGenericExample  {

}

class Hello<T> {
    public static <U extends Exception> void printException(U u) {
        byte b = 5;
        byte a = 1;
        double c = b + a;
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        Hello<?> s = new Hello<>();
    }
}

