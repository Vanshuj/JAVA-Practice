package DSA.Java;

import java.util.Scanner;
import java.util.HashSet;

public class RecursionIntermid {

//    public static void towerOfHanoi(int n, String src, String helper, String dest){
//        if(n==1){
//            System.out.println("transfer disk"+n+"from"+src+"to"+dest);
//            return;
//        }
//        towerOfHanoi(n-1, src, dest, helper);
//        System.out.println("transfer disk"+n+"from"+src+"to"+dest);
//        towerOfHanoi(n-1, helper, src, dest);
//    }

    //reverse string
//    public static String revString(String str) {
//        if(str.length() == 1) {
//            return str;
//        }
//        char currChar = str.charAt(0);
//        String nextString = revString(str.substring(1));
//        return nextString + currChar;
//    }

    // find occurence
//    public static int first = -1;
//    public static int last = -1;
//
//    public static void FindOcc(String s, int idx, char element){
//        if (idx==s.length()){
//            System.out.println("First Occurence: "+first);
//            System.out.println("Last Occurence: "+last);
//            return;
//        }
//
//        char curr=s.charAt(idx);
//        if (curr == element) {
//            if (first == -1) {
//                first = idx;
//                last = idx;
//            } else {
//                last = idx;
//            }
//        }
//        FindOcc(s,idx+1,element);
//    }

    // array  sorted?
//    public static boolean isSorted(int arr[], int index){
//        if(index== arr.length-1){
//            return true;
//        }
//        if(arr[index] <= arr[index+1]){
//            return isSorted(arr, index+1);
//        }else {
//            return false;
//        }
//    }

    //move x
    public static void MoveallX(String s,char x,int idx,int c,String news){
        if (idx==s.length()){
            for (int i=0;i<c;i++){
                news+=x;
            }
            System.out.println("Updated String: "+news);
            return;
        }
        char curr=s.charAt(idx);
        if (curr==x){
            c++;
            MoveallX(s,x,idx+1,c,news);
        }else {
            news+=curr;
            MoveallX(s,x,idx+1,c,news);
        }
    }


    // duplicates
//    public static String removeDuplicates(String str, int idx, boolean present[]) {
//        if(idx == str.length()) {
//            return "";
//        }
//        char curr = str.charAt(idx);
//        if(present[curr-'a']) {
//            return removeDuplicates(str, idx+1, present);
//        } else {
//            present[curr-'a'] = true;
//            return curr + removeDuplicates(str, idx+1, present);
//        }
//    }

// subsequences of a string
//public static void printSubseq(String str, int idx, String res) {
//    if(idx == str.length()) {
//        System.out.println(res);
//        return;
//    }
////choose
//    printSubseq(str, idx+1, res+str.charAt(idx));
////don't choose
//    printSubseq(str, idx+1, res);
//}

//public static void printSubseq2(String str, int idx, String res, HashSet<String> allSubseq) {
//    if(idx == str.length()) {
//        if(allSubseq.contains(res)) {
//            return;
//        }
//        allSubseq.add(res);
//        System.out.println(res);
//        return;
//    }
//
////choose
//    printSubseq(str, idx+1, res+str.charAt(idx), allSubseq);
////don't choose
//    printSubseq(str, idx+1, res, allSubseq);
//}

//public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
//        "tu", "vwx", "yz"};
//    public static void printKeypadCombination(String number, int idx, String res) {
//        if(idx == number.length()) {
//            System.out.println(res);
//            return;
//        }
//
//        for(int i=0; i<keypad[number.charAt(idx)-'0'].length(); i++) {
//            char curr = keypad[number.charAt(idx)-'0'].charAt(i);
//            printKeypadCombination(number, idx+1, res+curr);
//        }
//    }



    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
//      System.out.println("Enter value of n: ");
//      int n = sc.nextInt();

//      System.out.println("enter string: ");
//      String str = sc.nextLine();


//        System.out.println("enter size of array:");
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        System.out.println("enter array:");
//        for(int i =0; i<size; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(isSorted(arr, 0));


        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Enter the character to move at last: ");
        char x = sc.next().charAt(0);
        MoveallX(s,x,0,0," ");


//      towerOfHanoi(n, "S", "H", "D");


//      String reversed = revString(str);
//      System.out.println(reversed);


//        Scanner vc = new Scanner(System.in);
//        System.out.println("Enter the string: ");
//        String s =vc.nextLine();
//        System.out.println("Enter the a character u want to search: ");
//        char c=vc.next().charAt(0);
//        FindOcc(s,0,c);

//        boolean present[] = new boolean[str.length()];
//        System.out.println(removeDuplicates(str, 0, present));


//        String str1 = "abc";
//        String str2 = "aaa";
//        printSubseq(str1, 0, "");

//        String str1 = "abc";
//        String str2 = "aaa";
//        HashSet<String> allSubseq = new HashSet<>();
//        printSubseq2(str2, 0, "", allSubseq);

//        String number = "23";
//        printKeypadCombination(number, 0, "");

    }
}
