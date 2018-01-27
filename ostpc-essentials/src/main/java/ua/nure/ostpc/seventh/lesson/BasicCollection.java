package ua.nure.ostpc.seventh.lesson;

import java.util.*;
class A implements Comparable<A>{
    public int value;

    public A(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "A" + value;
    }

    @Override
    public int compareTo(A o) {
        return this.value - o.value;
    }

   /* @Override
    public int hashCode() {
        System.out.println("Hello from hashcode");
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
       *//* System.out.println("hello from equals");
        A o = (A) obj;
        return this.value == o.value;*//*
       return super.equals(obj);
    }*/
}
public class BasicCollection {
    public static void main(String[] args) {
        Set<A> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(new A(11), new A(2), new A(6), new A(2)));
        System.out.println(set);
    }
}
