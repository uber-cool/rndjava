package com.woc.w35;

import java.util.Scanner;

public class SurfaceArea {
    static int surfaceArea(int[][] a, int h, int w, int mh) {
        // Complete this function
        int sa = 0;
        sa += h*w*2; //bottom+top
        //left and right view
        for(int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                //left view
                if (i==0){
                    sa += a[i][j];
                }
                else if (a[i][j]>a[i-1][j]){
                    sa += a[i][j] - a[i-1][j];
                }
                //right view
                if (i+1==h){
                    sa += a[i][j];
                }
                else if (i+1<h && a[i][j] > a[i+1][j]){
                    sa += a[i][j] - a[i+1][j];
                }
                //front view
                if (j==0){
                    sa += a[i][j];
                }
                else if (a[i][j]>a[i][j-1]){
                    sa += a[i][j] - a[i][j-1];
                }
                //back view
                if (j+1==w){
                    sa += a[i][j];
                }
                else if (j+1<=w && a[i][j]>a[i][j+1]){
                    sa += a[i][j] - a[i][j+1];
                }
            }
        }
        return sa;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        int[][] A = new int[H][W];
        int maxHeight = 0;
        for(int A_i = 0; A_i < H; A_i++){
            for(int A_j = 0; A_j < W; A_j++){
                A[A_i][A_j] = in.nextInt();
                if (A[A_i][A_j] > maxHeight){
                    maxHeight = A[A_i][A_j];
                }
            }
        }
        int result = surfaceArea(A, H, W, maxHeight);
        System.out.println(result);
        in.close();
    }
}
