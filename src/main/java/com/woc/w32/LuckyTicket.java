package com.woc.w32;

import java.util.Scanner;

public class LuckyTicket {
    static String onceInATram(int x) {
        char [] first3 = Integer.toString(x/1000).toCharArray();
        char [] last3 = Integer.toString(x).substring(3).toCharArray();
        int [] digits = new int [6];
        int [] luckyticket = new int [6];
        int sumf3 = 0;
        for(int i=0; i<3; i++){
            sumf3 += Integer.parseInt(((Character) first3[i]).toString());
            digits[i] = Integer.parseInt(((Character) first3[i]).toString());
        }
        int suml3 = 0;
        for(int i=0; i<3; i++){
            suml3 += Integer.parseInt(((Character) last3[i]).toString());
            digits[3+i] = Integer.parseInt(((Character) last3[i]).toString());
        }
        int diff;
        String result = null;
        if(sumf3>=suml3){
            diff = sumf3-suml3;
            if (digits[5]+diff<=9) {
                luckyticket[5] = digits[5] + diff;
                luckyticket[3] = digits[3];
                luckyticket[4] = digits[4];
            }
            else if (digits[4] + diff-(9-digits[5])<=9){
                luckyticket[4] = digits[4] + diff-(9-digits[5]);
                luckyticket[5] = 9;
                luckyticket[3] = digits[3];
            }
            else {
                luckyticket[3] = digits[3] + diff - (9-digits[4]) - (9-digits[5]);
                luckyticket[5] = 9;
                luckyticket[4] = 9;
            }
            result = new String(first3);
            return result + luckyticket[3] + luckyticket[4] + luckyticket[5];
        }
        else{
            int a = x%10;
            a = x + (10-a);
            return onceInATram(a);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int f3 = x/1000;
        int l3 = 4;
        String result = onceInATram(x);
        System.out.println(result);
    }
}
