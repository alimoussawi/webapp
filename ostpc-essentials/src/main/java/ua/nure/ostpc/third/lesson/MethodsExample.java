package ua.nure.ostpc.third.lesson;

public class MethodsExample {
    public void doSomething() {
        System.out.println("Hello from no argument");
    }

    public void doSomething(String name) {
        System.out.println(name);
    }

    public void doSomething(String name, String ali, String hesmat, String mohammad, String ...items) {
        for (int i = 0; i< items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public static void main(String[] args) {
        new MethodsExample().doSomething("Eugene", "Ali","Heshmat","Mohammad");
    }
}
