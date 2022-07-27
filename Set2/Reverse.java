package Algorithims.Set2;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverseString("my Dog"));
    }
    public static String reverseString (String myString) {
        String reversedString= "";
        char ch;
        for (int i = 0; i < myString.length(); i++) {
            ch = myString.charAt(i);
            reversedString = ch + reversedString;

        }
        return reversedString;
    }
}