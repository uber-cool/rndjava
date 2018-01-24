package com.woc.w35;

import java.math.BigInteger;
import java.util.Scanner;

public class HighwayConstruction {
    static BigInteger highwayConstruction(long n, int k) {
        // Complete this function
        BigInteger sum = new BigInteger("0");
        BigInteger t;
        for (Integer i = 2; i<n; i++){
            t = BigInteger.valueOf(i);
            t = t.pow(k);
            sum.add(t);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long n = in.nextLong();
            int k = in.nextInt();
            System.out.println(highwayConstruction(n, k));
        }
        in.close();
    }
}
