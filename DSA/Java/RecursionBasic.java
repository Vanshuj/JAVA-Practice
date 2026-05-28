package DSA.Java;

import java.util.Scanner;

public class RecursionBasic {
//        //print reverse number
//    public static void printNumbers(int n) {
//        if(n == 0) {
//            return;
//        }
//        System.out.println(n);
//        printNumbers(n-1);
//    }

    //print 1to6
//    public static void printNumbers (int n, int x) {
//        if(n == x) {
//            return;
//        }
//        System.out.println(n);
//        printNumbers(n + 1, x);
//    }

    //print sum
//    public static void printSum(int n, int sum) {
//        if (n == 0) {
//            System.out.println(sum);
//            return;
//        }
//        sum += n;
//        printSum(n - 1, sum);
//    }

//    //factorial
//    public static void printFactorial(int n, int fact) {
//        if(n == 0) {
//            System.out.println(fact);
//            return;
//        }
//        fact *= n;
//        printFactorial(n-1, fact);
//    }

//    //fibonacci
    public static void printFib(int a, int b, int n){
        if(n==0){
            return;
        }
        int c= a+b;
        System.out.println(c);
        printFib(b,c,n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n: " );
        int n = sc.nextInt();
        System.out.println("enter value of x: ");
        int x = sc.nextInt();

//        printNumbers(n,x);
//        printSum(n, x);
//        printFactorial(n, 1);
//
        int a = 0, b=1;
        System.out.println(a);
        System.out.println(b);
        printFib(a, b , n-2);
    }
}
