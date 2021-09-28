import java.util.Scanner;

public class HigherNumber{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tree numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        /*  First Solution

        if(a > b && a > c){
            System.out.println("Higher is 'A':" + a);
        } else if(b > c){
            System.out.println("Higher is 'B':" + b);
        } else {
            System.out.println("Higher is 'C':" + c);
        }
        */

        // Second Solution
        int higher = max(a,b,c);
        showResult(higher);

        sc.close();
    }
    // continue second solution
    public static int max(int x, int y, int z){
        int aux;
        if(x > y && x > z){
            aux = x;
        } else if( y > z){
            aux = y;
        }else{
            aux = z;
        } 
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher is " + value);
    } 
    // end of second solution
}
