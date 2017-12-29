package ua.nure.ostpc.third.lesson;

public class AccesModifiersClass {
    public int accessModifierPublic = 1;
    protected int accessModifierProtected = 2;
    int packageAccessModifier = 3;
    private int privateAccessModifier = 4;

    public static void main(String[] args) {
       new InitializationLifetime();
    }
}