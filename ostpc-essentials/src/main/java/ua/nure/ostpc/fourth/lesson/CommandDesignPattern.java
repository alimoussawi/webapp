package ua.nure.ostpc.fourth.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Command {
    void invoke();
}

class RequestCommand implements Command {
    @Override
    public void invoke() {
        System.out.println(this.getRequest());
    }

    private String getRequest() {
        return "req";
    }
}

class DatabaseCommand implements Command {
    @Override
    public void invoke() {
        System.out.println(this.getConnectionString());
    }

    private String getConnectionString() {
        return "mysql";
    }
}

public class CommandDesignPattern {
    private static List<Command> commandList = Arrays.asList(new DatabaseCommand(), new RequestCommand());

    public static void main(String[] args) {
        new CommandDesignPattern().invokeCommands(commandList);
        new CommandDesignPattern().invokeCommands(Arrays.asList(
                new Command() {
                    @Override
                    public void invoke() {
                        System.out.println("Ali hello" + this.hashCode());
                    }

                    @Override
                    public int hashCode() {
                        return 1;
                    }
                }, new Command() {
                    @Override
                    public void invoke() {
                        System.out.println("Mohammad hello" + this.toString());
                    }

                    @Override
                    public String toString() {
                        return "$classname{}";
                    }
                }, new Command() {
                    @Override
                    public void invoke() {
                        System.out.println("Heshmat hello");
                    }
                }
        ));
    }

    public void invokeCommands(List<Command> commands) {
        for (int i = 0; i < commands.size(); i++) {
            commands.get(i).invoke();
        }
    }
}