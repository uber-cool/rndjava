package com.thirtydays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
    static List<Integer> primeNumbers = new ArrayList();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++) {
            int a = in.nextInt();
            if (verifyPrime(a)){
                System.out.println("Prime");
            }
            else
                System.out.println("Not prime");
        }
    }

    private static void populatePrimeList() {
        int n = 3;
        while (n<100000000){
            if (checkPrime(n))
                primeNumbers.add(n);
            n += 2;
        }
    }

    private static boolean checkPrime(int n){
        if (primeNumbers.isEmpty()) {
            primeNumbers.add(2);
            return true;
        }
        for (int a: primeNumbers){
            if (n%a == 0)
                return false;
        }
        return true;
    }
    private static boolean verifyPrime(int n){
        if (n==1)
            return false;
        int sqrt = (int) Math.sqrt(n);
        int a=2;
        while(a<=sqrt){
            if (n%a == 0)
                return false;
            a+=2;
        }
        return true;
    }
}
