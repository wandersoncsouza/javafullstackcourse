package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the length of the matriz: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        int neg = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println("Insert the value of matriz on: " + i + ":" + j );
                mat[i][j] = sc.nextInt();
                if(mat[i][j] < 0){
                    neg ++;
                }
            }
        }
        System.out.print("Main diagonal: ");
        for(int i=0; i<n; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println("Negative number is: " + neg);
        

        sc.close();
    }
}
