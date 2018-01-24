package com.woc.w35;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LuckyLaptop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int lowest = Integer.MAX_VALUE;
        Map<String, Integer> list = new HashMap<>(n);
        String result = null;
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            int price = in.nextInt();
            if (price>lowest)
                continue;
            boolean lucky = checkLuckyPrice(price);
            if (lucky){
                if (price < lowest) {
                    lowest = price;
                    result = s;
                }
            }
        }
        in.close();
        if (lowest == Integer.MAX_VALUE){
            System.out.println("-1");
        }
        else
            System.out.println(result);
    }

    private static boolean checkLuckyPrice(int price) {
        int count4 = 0;
        int count7 = 0;
        int d;
        while(price > 0){
            d = price%10;
            if (d == 4) {
                price = price / 10;
                count4++;
            }
            else if (d == 7){
                price = price / 10;
                count7++;
            }
            else
                return false;
        }
        if (count4 == count7)
            return true;
        return false;
    }
}
