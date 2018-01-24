package com.woc.w35;

import java.util.Scanner;

public class TripleRecursion {
    static void tripleRecursion(int n, int m, int k) {
        // Complete this function
        int [][] matrix = new int [n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i>j){
                    matrix[i][j] = matrix[i-1][j] - 1;
                }
                else if (i<j){
                    matrix[i][j] = matrix[i][j-1] - 1;
                }
                else if (i==j && i==0){
                    matrix[i][j] = m;
                }
                else if (i==j){
                    matrix[i][j] = matrix[i-1][j-1] + k;
                }
            }
        }
        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        tripleRecursion(n, m, k);
        in.close();
    }
}
