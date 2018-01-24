package com.thirtydays;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashSet;
import java.util.Set;

public class TestCase {
    public static void main(String[] args) {
        Set<Integer> valueOfn = new HashSet<>(5);
        for (int i=0; i<5; i++) {
            int n = 0;
            while (n < 3 && valueOfn.size() != 5) {
                n = (int) (Math.random() * 201);
                valueOfn.add(n);
            }
        }
        for(int n : valueOfn){
            int k = 0;
            while(k<1)
                k = (int) (Math.random()*(n+1));
            System.out.println(n +" "+k);
            int [] t = new int[n];
            boolean negativeGenerated = false;
            boolean zeroGenerated = false;
            int z = 0;
            int neg = 0;
            for (int j=0; j<n; j++){
                int v = (int) (Math.random()*1001);
                int p = (int) (Math.random()*10);
                if(v==0){
                    zeroGenerated = true;
                    z = j;
                }
                if (p>=5) {
                    v = -v;
                    negativeGenerated = true;
                }
                t[j] = v;
            }
            if(!zeroGenerated){
                z = (int) (Math.random()*(n+1));
                t[z] = 0;
            }
            if (!negativeGenerated){
                neg = (int) (Math.random()*(n+1));
                while (neg==z){
                    neg = (int) (Math.random()*(n+1));
                }
                t[neg] = -(int) (Math.random()*1001);
            }
            for (int j=0; j<n; j++){
                System.out.print(t[j]+" ");
            }
            System.out.println();
        }
    }
}
