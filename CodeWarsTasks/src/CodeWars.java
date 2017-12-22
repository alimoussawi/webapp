public class CodeWars {
    public static String oddOrEven (int[] array) {
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        if (sum%2==1)
            return "odd";
        else
            return "even";

    }
}
