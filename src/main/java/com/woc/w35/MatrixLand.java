package com.woc.w35;

import java.util.Scanner;

public class MatrixLand {


    static int matrixLand(int[][] a, int n, int m) {
        // Complete this function
        for (int i=0; i<n; i++)
            findMaxinRow(a[i], m);
        return 0;
    }

    private static void findMaxinRow(int[] row, int n) {
        boolean firstPositive = false;
        for (int i=0; i<n; i++){
            if (!firstPositive && row[i]<0)
                continue;
            firstPositive = true;

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] A = new int[n][m];
        for(int A_i = 0; A_i < n; A_i++){
            for(int A_j = 0; A_j < m; A_j++){
                A[A_i][A_j] = in.nextInt();
            }
        }
        int result = matrixLand(A, n, m);
        System.out.println(result);
        in.close();
    }
}
