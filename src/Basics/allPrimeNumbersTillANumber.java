package Basics;

import java.util.Scanner;

public class allPrimeNumbersTillANumber {
    public static boolean isPrime(int a){
        boolean isPrime = true;
        for (int i = 2; i <= a/2; i++) {
            if (a % i == 0){
                isPrime = false;
            }
        }
        if (isPrime){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int totalPrime = 1;
        System.out.print(2+ ", ");
        for (int i = 3; i < num-1; i++) {
            if (isPrime(i)){
                System.out.print(i+", ");
                totalPrime++;
            }
        }
        System.out.println();
        System.out.println("Total Prime Numbers till "+num +": "+ totalPrime);

    }
}
