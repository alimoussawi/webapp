package ua.nure.ostpc.seventh.lesson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIterable<T extends Number> implements Iterable<T> {
    private List<T> oddList = new ArrayList<>();
    private List<T> evenList = new ArrayList<>();
    private List<T> zeros = new ArrayList<>();

    public SimpleIterable(T[] items) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].intValue() % 2 == 0 && items[i].intValue() != 0) {
                evenList.add(items[i]);
            } else if (items[i].intValue() == 0) {
                zeros.add(items[i]);
            } else {
                oddList.add(items[i]);
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < oddList.size() + evenList.size();
            }

            @Override
            public T next() {
                if (currentIndex < oddList.size()) {
                    T result = oddList.get(currentIndex);
                    currentIndex++;
                    return result;
                } else {
                    T result = evenList.get(currentIndex - oddList.size());
                    currentIndex++;
                    return result;
                }
            }
        };
    }
}


class Main {
    public static void main(String[] args) {
        SimpleIterable<Integer> iterable = new SimpleIterable<>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 0, 0, 0});
        Iterator<Integer> iterator = iterable.iterator();
        Iterator<Integer> anotherItearot = iterable.iterator();
        for(Integer item : iterable) {
            System.out.println(item);
        }
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        while (anotherItearot.hasNext()) {
            System.out.println("hello Heshmat :) ");
            System.out.println(anotherItearot.next());
        }
    }
}