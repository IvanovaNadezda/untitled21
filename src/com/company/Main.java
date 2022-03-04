package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] F;
        F = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                F[i][j]=0;
            }
        }
        F[1][1]=1;
        for(int i=n+1; i>=2; i++){
            for(int j=m+1; j>=2; j++){
                F[i][j]=F[i+1][j+2]+F[i+2][j+1];
            }
        }
        System.out.println(F[n][m]);
    }
}
