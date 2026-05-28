package DSA.Java;

import java.util.*;
public class TwoDArrays {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows = sc.nextInt();
        System.out.println("Enter coloums:");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        System.out.println("Enter array: ");
        for (int i =0; i<rows; i++){
            for (int j=0; j<cols; j++){
                numbers[i][j]= sc.nextInt();
            }
        }

        System.out.println("Array is:");
        for (int i =0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("Enter key value:");
        int x =sc.nextInt();
        for (int i =0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(numbers[i][j]==x){
                    System.out.println("x found at locsation("+i+", "+j+")");
                }
            }
        }
    }
}
