package ua.nure.ostpc.second.lesson;
import static java.lang.Math.*;

public class ImportStatic {
    public static void main(String[] args) {
        System.out.println(new ImportStatic().calculateSum(1,2));
    }

    public double calculateSum(float a, float b) {
        return pow(round(a) + round(b), 2);
    }

    public double pow(int a, int b) {
        return 99;
    }
}
