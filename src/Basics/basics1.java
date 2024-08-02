package Basics;

public class basics1 {
    public static void main(String[] args) {

        System.out.println("Jai Siya Ram");
        // Array:
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {

            System.out.println("Index: "+ i + " Value: "+ arr[i]);
        }
        // Method Usage:
        int s = arraySum(arr);
        System.out.println(s);
    }
    // Method Initialisation:
    public static int arraySum(int[] myArr){
        int sum = 0;
        for(int i = 0; i < myArr.length; i++) {
            sum+=myArr[i];
        }
        return sum;
    }
}
