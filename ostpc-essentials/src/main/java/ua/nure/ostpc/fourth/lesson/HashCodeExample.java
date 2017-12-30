package ua.nure.ostpc.fourth.lesson;

import java.util.HashSet;

class Processor {
    @Override
    public int hashCode() {
        System.out.println("Hello from proc");
        return 2;
    }

    @Override
    public String toString() {
        return "Processor";
    }
}

class VideoCard {
    @Override
    public int hashCode() {
        System.out.println("Hello from video card");
        return 2;
    }

    @Override
    public String toString() {
        return "VideoCard";
    }
}
class Computer {
    private Processor processor;

    @Override
    public int hashCode() {
        System.out.println("Hello from computer");
        return 1;
    }

    @Override
    public String toString() {
        return "Computer";
    }
    @Override
    public boolean equals(Object obj) {
        System.out.println("Computer equals");
        return this.hashCode() == obj.hashCode();
    }
}

class Ram {
    @Override
    public boolean equals(Object obj) {
        System.out.println("Ram equals");
        return false;
    }

    @Override
    public int hashCode() {
        System.out.println("Hello from ram hashcode");
        return 1;
    }

    @Override
    public String toString() {
        return "Ram";
    }
}
public class HashCodeExample {
    private String hello;

    public static void hashCodeExample() {
        HashSet<Object> hashSet = new HashSet<>();
        Ram ram1 = new Ram();
        Ram ram2 = new Ram();
        Computer computer = new Computer();
        hashSet.add(new VideoCard());//2
        hashSet.add(ram1); //1
        hashSet.add(ram2); //1
        hashSet.add(new Processor());//2
        hashSet.add(computer);//1
        hashSet.add(new HashCodeExample());//default hashcode
        System.out.println("=====================");
        System.out.println(hashSet.contains(computer));
        System.out.println("=====================");
        for(Object o : hashSet) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        hashCodeExample();
    }

    @Override
    public int hashCode() {
        return 15;
    }
}
