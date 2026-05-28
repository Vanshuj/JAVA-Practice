package DSA.Java;

import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName =sc.next();
        String secondName = sc.next();

        //join strings
        String fullName = firstName + " " + secondName;
        System.out.println(fullName);

        //length
        System.out.println(fullName.length());

        //print character
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        //compare strings
        String name1 = "Vanya";
        String name2 = "Vanya";


        if(name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        // insert and delet
        StringBuilder sb = new StringBuilder("Vanya");
        //Insert char
        sb.insert(0, 'J');
        System.out.println(sb);
        //delete char
        sb.delete(0, 1);
        System.out.println(sb);

        //reverse character
        StringBuilder ab = new StringBuilder("HelloWorld");

        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = ab.length() - i - 1;


            char frontChar = ab.charAt(front);
            char backChar = ab.charAt(back);


            ab.setCharAt(front, backChar);
            ab.setCharAt(back, frontChar);
        }


        System.out.println(sb);


    }
}
