package DSA.Java;
import java.sql.SQLOutput;
import java.util.Scanner;
public class RecursionAdvance {
//    public static void printPrem(String str, String permutation){
//        if(str.length()==0){
//            System.out.println(permutation);
//            return;
//        }
//        for(int i=0; i<str.length(); i++){
//            char currChar = str.charAt(i);
//            //"abc"->"ab"
//            String newStr = str.substring(0, i)+ str.substring(i+1);
//            printPrem(newStr, permutation+currChar);
//        }
//    }


//    public static int countPaths(int i,int j, int n, int m){
//        if (i==n || j==m){
//            return 0;
//        }
//        if(i == n-1 && j == m-1){
//            return 1;
//        }
//        int downPaths = countPaths(i+1,j, n, m);
//        int rightPaths = countPaths(i, j+1, n, m);
//        return downPaths + rightPaths;
//    }

    public static int placeTiles(int n, int m){
        if (n==m){
            return 2;
        }
        if (n<m){
            return 1;
        }
        //vertical
        int vertPlacements = placeTiles(n-m, m);
        
        //horizontal
        int horPlacements = placeTiles(n-1, m);

        return vertPlacements + horPlacements;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the string: ");
//        String str = sc.nextLine();
//        printPrem(str, "");

        System.out.println("enter value of n: ");
        int n = sc.nextInt();
        System.out.println("enter value of m: ");
        int m = sc.nextInt();
//        int totalPaths= countPaths(0,0, n, m);
//        System.out.println(totalPaths);

        System.out.println(placeTiles(n, m));
    }
}
