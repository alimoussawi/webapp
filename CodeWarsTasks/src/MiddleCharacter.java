public class MiddleCharacter {
    public static String getMiddle(String word) {
        int position;
        int length;
        if(word.length()%2==0) {
            position = word.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = word.length() / 2;
            length = 1;
        }
        return word.substring(position, position + length);
    }

///substring Returns the substring starting from the given index(beginIndex) till the specified index(endIndex).
}
