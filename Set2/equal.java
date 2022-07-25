package Algorithims.Set2;

public class equal {
    public static void main(String[] args) {
        System.out.println(SameNumber(10,11));
    }


    public static boolean SameNumber ( int x , int y) {
        boolean SameNumber;
        if ( x == y)
            SameNumber = true;
        else
            SameNumber = false;
        return SameNumber;
    }
}
