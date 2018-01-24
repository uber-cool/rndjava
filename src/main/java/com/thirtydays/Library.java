package com.thirtydays;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();
        int ed = in.nextInt();
        int em = in.nextInt();
        int ey = in.nextInt();
        Calendar returnDate = Calendar.getInstance();
        returnDate.set(y, m-1, d);
        Calendar dueDate = Calendar.getInstance();
        dueDate.set(ey, em-1, ed);
        int fine = 0;
        if (returnDate.before(dueDate)){
            fine = 0;
        }
        else{
            if (returnDate.get(Calendar.YEAR) > dueDate.get(Calendar.YEAR)){
                fine = 10000;
            }
            else {
                if (returnDate.get(Calendar.MONTH) > dueDate.get(Calendar.MONTH)){
                    fine = 500 * (returnDate.get(Calendar.MONTH) - dueDate.get(Calendar.MONTH));
                }
                else{
                    fine = 15 * (returnDate.get(Calendar.DATE) - dueDate.get(Calendar.DATE));
                }
            }
        }
        System.out.println(fine);
    }
}
