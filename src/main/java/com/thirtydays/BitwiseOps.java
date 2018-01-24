package com.thirtydays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BitwiseOps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i=0; i<t; i++){
            int a = in.nextInt();
            int k = in.nextInt();
            int maxAndValue = Integer.MIN_VALUE;
            int andValue;
            for (int p=1; p<a; p++){
                for (int q=p+1; q<=a; q++){
                    andValue = p & q;
                    if(andValue > maxAndValue && andValue < k)
                        maxAndValue = andValue;
                }
            }
            System.out.println(maxAndValue);
        }
    }
}
