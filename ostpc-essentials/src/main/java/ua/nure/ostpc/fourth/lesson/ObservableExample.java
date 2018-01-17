package ua.nure.ostpc.fourth.lesson;

import java.util.ArrayList;
import java.util.List;

interface Observable {
    void wake();
}

interface Subscribable {
    Observable subscribe(Observer observer);
}

class Observer implements Observable {
    protected String param;

    public Observer(String param) {
        this.param = param;
    }

    @Override
    public void wake() {
        System.out.println("Hello, I am awaken" + this.param);
    }
}

class AsyncTask implements Subscribable, Command {
    private List<Observable> listeners = new ArrayList<>();

    @Override
    public Observable subscribe(Observer observer) {
        listeners.add(observer);
        return observer;
    }

    @Override
    public void invoke() {
        this.listeners.forEach(listener -> listener.wake());
    }
}
class SpecificObserver extends Observer {
    private String param2;

    public SpecificObserver(String param1, String param2) {
        super(param1);
        this.param2 = param2;
    }

    @Override
    public void wake() {
        System.out.println(param + param2);
    }
}
public class ObservableExample {
    public static void main(String[] args) {
        AsyncTask asyncTask = new AsyncTask();
        asyncTask.subscribe(new Observer("Param1"));
        asyncTask.subscribe(new Observer("Param2"));
        asyncTask.subscribe(new SpecificObserver("Param3", "Param4"));
        asyncTask.invoke();
        asyncTask.subscribe(new Observer("Param5"));
        asyncTask.invoke();
    }
}
