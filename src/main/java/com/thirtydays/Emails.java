package com.thirtydays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Emails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> names = new ArrayList<>();
        for (int i=0; i<n; i++){
            String name = in.next();
            String email = in.next();
            if (email.endsWith("@gmail.com")){
                names.add(name);
            }
        }
        Collections.sort(names);
        for (String s : names){
            System.out.println(s);
        }
    }
}
