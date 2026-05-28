package DSA.Java;

import java.util.*;

public class Pattern {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n= sc.nextInt();
        /*
        System.out.println("Enter value of m");
        int m = sc.nextInt();
        // 1

        for (int i=1; i<= n; i++){
            for (int j=1; j<=m; j++){
                if (i==1||j==1||i==n||j==m){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //2
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print ("* ");
            }
            System.out.println();
        }

        //3

        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //4
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
/*
        //5
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.println(j + "");
            }
            System.out.println();
        }

        //6
        for (int i = 1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.println(j);
            }
            System.out.println();
        }

        //7
        int num = 1;
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

        //8
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum =i+j;
                if(sum%2==0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
                System.out.println();
            }
        }

        //9
        //upper half
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int space =2*(n-i);
            for (int j=1; j<=i; j++){
                System.out.print("");
            }
            System.out.println();
        }
        //lower half
        for (int i =n ; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int space =2*(n-i);
            for (int j=1; j<=i; j++){
                System.out.print("");
            }
            System.out.println();
        }

        //10
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("");
            }
            for (int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //11
        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //12
        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("");
            }
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //13
        //upper half
        for (int i=1; i<=n; i++){
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i=n; i>=1; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
