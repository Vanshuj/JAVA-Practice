package hi.vanshu;

public class V_35_PS07 {
    //problem 1
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    //problem 2
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // problem 7 using recursion
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //problem 3
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }


    // problem 4
    static void pattern2(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i ; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //problem 8 recursion
    static void pattern2_rec(int n){
    if (n > 0) {
        for (int i = n; i >= 1; i--) {
            System.out.print("*");
        }
        System.out.println();
        pattern2_rec(n-1);
    }
    }

    // Problem 5
    // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        }
        return fib(n-1) + fib(n-2);
    }

    // problem 6
    static double sum(double ...arr){

        double result = 0;
        for (double a: arr){
            result +=a;
        }
        return result/ arr.length;
    }

    // problem 9
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    //problem 10
    static int sumIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        //problem 1
//        multiplication(7);

        // problem 2, 7
//        pattern1(4);
//        pattern1_rec(3);

        //problem 3
//        int c = sumRec(4);
//        System.out.println(c);

        // problem 4, 8
//        pattern2(4);
//        pattern2_rec(4);

        // Problem 5
//        int result = fib(6);
//        System.out.println(result);

//        problem 6
//        System.out.println(sum(32, 10,12));

        //problem 9
//        double celsius = 25;
//        double fahrenheit = celsiusToFahrenheit(celsius);
//        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F.");

        //problem10
        int n = 5; // Example input
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sumIterative(n));
    }
    
}
