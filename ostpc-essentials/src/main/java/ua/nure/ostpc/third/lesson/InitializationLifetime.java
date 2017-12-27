package ua.nure.ostpc.third.lesson;

/*
1. Static variable initialization
2. Static block of code
3. Each time object is created ->
    3.1 Initialize non-static members
    3.2 Execute non-static block of code
    3.3 Constructor
 */
public class InitializationLifetime {
    public InitializationLifetime() {
        System.out.println("Hello I am from constructor");
    }
    public static int variable = 1;

    static {
        System.out.println("Hello, I am from static block");
        System.out.println(variable);
        staticBlockVariable = 2;
    }

    public static int staticBlockVariable;

    static {
        System.out.println(staticBlockVariable);
    }

    public int nonStaticProperty = 0;

    {
        nonStaticProperty = 1;
        nonStaticPopertyOne = 2;
        System.out.println("Hello from non-static block of code");
    }

    public int nonStaticPopertyOne;

    public static void main(String[] args) {

        new InitializationLifetime();
        new InitializationLifetime();
        new InitializationLifetime();
    }

}
