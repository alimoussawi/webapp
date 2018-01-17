package ua.nure.ostpc.fourth.lesson;

interface IMyBestCommand {
    void invoke();
}

interface IMyBestAnotherInterface {

}

interface ICommand extends IMyBestCommand, IMyBestAnotherInterface {

}

class Item implements IMyBestCommand {
    @Override
    public void invoke() {
        System.out.println("Hello from item");
    }
}

class AnotherItem implements IMyBestCommand {
    @Override
    public void invoke() {
        System.out.println("Hello from another item");
    }
}
public class InterfaceExample {

    public static void doSmth(IMyBestCommand item) {
        item.invoke();
    }

    public static void main(String[] args) {
        doSmth(new Item());
        doSmth(new AnotherItem());
    }
}
