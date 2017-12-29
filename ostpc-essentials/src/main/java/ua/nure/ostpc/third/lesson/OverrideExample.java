package ua.nure.ostpc.third.lesson;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Panzer {
    public void shoot() {
        System.out.println("pzhhhh babah");
    }

    public void shoot(String babah) {
        System.out.println(babah);
    }
}

class Tank extends Panzer {
    @Override
    public void shoot() {
        super.shoot();
        System.out.println("Babah pzhhhh");
    }

    @Override
    public void shoot(String babah) {
        System.out.println("Eugene");
    }
}

class ContainerClass {
    public static List<OverrideExample> lst = new ArrayList<>();

}

public class OverrideExample {


    public int id;

    public OverrideExample(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        OverrideExample source = (OverrideExample) obj;
        return this.id == source.id;
    }

    public static void main(String[] args) {
        OverrideExample example = new OverrideExample(1);
        OverrideExample example1 = new OverrideExample(1);
        ContainerClass.lst.add(example1);
        System.out.println(
                ContainerClass.lst.contains(example));
    }
}
