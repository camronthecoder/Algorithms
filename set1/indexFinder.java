package Algorithims.set1;
//Create a function that searches for the index of a given item in an array.
// If the item is present, it should return the index, otherwise, it should return -1.
public class indexFinder {
    public static void main(String[] args) {

        int inputNumber=5;
        int[] givenArray = { 10, 5 ,2 , 6, 9 };
        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] == inputNumber){
                System.out.println(i-1);
            }

        }
    }

}
