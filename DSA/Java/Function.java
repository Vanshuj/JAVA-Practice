package DSA.Java;

import java.util.Scanner;
public class Function {

    public static void printName (Strings name){
        System.out.println("My name is " +name);
        return;
    }

    public static int calcSum (int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int calcProduct (int a, int b){
        int prod = a * b;
        return prod;
    }
    public static void printFactorial(int n){
        int factorial = 1;

        for (int i=n;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(Strings arg[]){
        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("enter tow numbers" );
//        int a = sc.nextInt();
//        int b = sc.nextInt();

        System.out.println("enter number for factorial: ");
        int n= sc.nextInt();

//        printName(name);

//        int sum = calcSum(a, b);
//        System.out.println("Sum is : " + sum);
//
//        System.out.println("Product is : " + calcProduct(a,b));

        printFactorial(n);
    }
}
