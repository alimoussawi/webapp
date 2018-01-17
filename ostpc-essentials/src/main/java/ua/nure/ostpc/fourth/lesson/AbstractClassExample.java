package ua.nure.ostpc.fourth.lesson;

public abstract class AbstractClassExample {
    public static void dayOfAGuy(AbstractClassExample guy) {
        guy.live();
    }
    public static void main(String[] args) {
        dayOfAGuy(new Mohammad());
        System.out.println("==============");
        dayOfAGuy(new Ali());
        System.out.println("==============");
        dayOfAGuy(new Heshmat());
    }
    public abstract void eat();
    public void live() {
        this.wakeUp();
        this.eat();
        sleep();
    }
    public void wakeUp() {
        System.out.println("wake up");
    }

    private void sleep() {
        System.out.println("sleep");
    }
}

class Mohammad extends AbstractClassExample {
    @Override
    public void eat() {
        System.out.println("Eat burgher");
    }
}

class Ali extends AbstractClassExample {
    @Override
    public void eat() {
        System.out.println("Eat Shawerma");
    }
}

class Heshmat extends AbstractClassExample {
    @Override
    public void eat() {
        System.out.println("Eat chicken");
    }
}
