package Basics;
import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        // Program 2 : Even or Odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int number = sc.nextInt();
        if(number%2 == 0 ){
            System.out.println("Even");
        }else System.out.println("Odd");
    }
}
