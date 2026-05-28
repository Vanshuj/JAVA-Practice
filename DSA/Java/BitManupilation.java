package DSA.Java;

import java.util.*;
public class BitManupilation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int  oper = sc.nextInt();
        int n = 5;
        int pos = 1;           //2,3,2,1
        int bitMask = 1<<pos;
        // Get bit
//        if ((bitMsk & n)==0){
//            System.out.println("bit was zero");
//        }else{
//            System.out.println("bit was one");
//        }
        // set bit
//        int newNumber = bitMask | n ;
//        System.out.println(newNumber);

        // clear bit
//        int notBitMask = ~(bitMask);
//
//        int newNumber = notBitMask & n;
//        System.out.println(newNumber);

        //update bit
        if(oper == 1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
