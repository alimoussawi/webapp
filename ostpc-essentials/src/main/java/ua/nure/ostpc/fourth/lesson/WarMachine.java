package ua.nure.ostpc.fourth.lesson;

interface Firable {
    void fire();
}

interface Transferable {
    void transfer();
}

class Cannon implements Firable {
    public void fire() {
        System.out.println("cannon bah");
    }
}

class Panzer implements Firable {
    public void fire() {
        System.out.println("panzer bah");
        new Cannon().fire();
    }
}

class PanzerShrek implements Firable, Transferable {
    public void fire() {
        System.out.println("Panzer is injured");
    }

    @Override
    public void transfer() {
        System.out.println("transfer");
    }
}

public class WarMachine {
    public static void main(String[] args) {
        WarMachine warMachine = new WarMachine();
        warMachine.fireItem(new Cannon());
        warMachine.fireItem(new PanzerShrek());
        warMachine.fireItem(new Panzer());
        warMachine.moveRight(new PanzerShrek());
    }

    public void fireItem(Firable warItem) {
        warItem.fire();
    }

    public void moveRight(Transferable transferable) {
        transferable.transfer();
    }
}
