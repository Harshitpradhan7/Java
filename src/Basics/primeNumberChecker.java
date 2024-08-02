package Basics;

import java.util.Scanner;

public class primeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        for (int j = num/2; j >=2 ; j--) {
            if(num%j == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }

}
