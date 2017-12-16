package ua.nure.ostpc.second.lesson;

public class CharacterExample {
    public static void main(String[] args) {
        char character = 'a';
        int a = '2';
        System.out.println(a);
        char b = 50;
        char max1 = '1';
        char max2 = '2';
        int sum = max1 + max2;
        System.out.println(sum);
        char maxChar = 0xFFFF;
        char minChar = 0x0000;
        char aa = new Character('2');
        Character bb = '2';
        Character cc = 2;
        System.out.println('2' == 50); //true
        System.out.println(Character.codePointAt("sdhfsgdfs21312shgdsgdhfgdf", 1));
    }
}
