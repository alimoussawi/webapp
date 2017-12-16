package ua.nure.ostpc;

public class SimpleMaths {
    public int multiply(int a, int b) {
        return a * b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int dvide(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        new SimpleMaths().parseString("110");
    }
    public int parseString(String value) {
        int result = 0;
        for (int i = 0; i< value.length(); i++) {
            int codePoint = value.charAt(i);
            int currentNumber = codePoint - 48;
            result += currentNumber * Math.pow(10, value.length() - i - 1);
        }
        System.out.println(result);
        return result;
    }
}
