package Algorithims.Set3;

public class reverseTheNumbers {
    public static void main(String[] args) {
        System.out.println(rev(124));
    }
    public static String rev(int n) {
    String StrnN = Integer.toString(n);
    String revStrN = new StringBuffer(StrnN).reverse().toString();
    return revStrN.replace('-', ' ').trim();

    }

}
