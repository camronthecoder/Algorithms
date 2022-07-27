package Algorithims.Set3;

public class getWordCount {
    public static void main(String[] args) {
        System.out.println("There Are " + WordCount("The dog crossed the Road") + " spaces in the scentence.");
    }

    public static int WordCount(String sentance) {
        int wordCount= 0 ;
        char[] myStringArray= sentance.toCharArray();
        for (int i = 0; i < myStringArray.length; i++) {
            if (myStringArray[i] == ' ') {
                wordCount++;
            }
        }
        return wordCount;

    }}

