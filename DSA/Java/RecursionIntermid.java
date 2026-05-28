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
//    public static void getIndices(String str, char el, int idx) {
//        if (idx == str.length()) {
//            return;
//        }
//        if (str.charAt(idx) == el) {
//            if (first == -1) {
//                first = idx;
//            } else {
//                last = idx;
//            }
//        }
//        getIndices(str, el, idx + 1);
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
//    public static String addX(int count) {
//        String newStr = "x";
//        for(int i=1;i<count; i++) {
//            newStr += 'x';
//        }
//        return newStr;
//    }
//    public static String moveAllX(String str, int idx, int count) {
//        if(idx == str.length()) {
//            return addX(count);
//        }
//        if(str.charAt(idx) == 'x') {
//
//            return moveAllX(str, idx+1, count+1);
//        } else {
//            String nextStr = moveAllX(str, idx+1, count);
//            return str.charAt(idx) + nextStr;
//        }
//    }

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

//public static void printSubseq(String str, int idx, String res, HashSet<String> allSubseq) {
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

public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
        "tu", "vwx", "yz"};
    public static void printKeypadCombination(String number, int idx, String res) {
        if(idx == number.length()) {
            System.out.println(res);
            return;
        }

        for(int i=0; i<keypad[number.charAt(idx)-'0'].length(); i++) {
            char curr = keypad[number.charAt(idx)-'0'].charAt(i);
            printKeypadCombination(number, idx+1, res+curr);
        }
    }



    public static void main (String args[]){
//        Scanner sc = new Scanner(System.in);
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

//        int count = 0;
//        String newStr = moveAllX(str, 0, count);
//        System.out.println(newStr);
//      towerOfHanoi(n, "S", "H", "D");

//      String reversed = revString(str);
//      System.out.println(reversed);

//        char el = 'a';
//        getIndices(str, el, 0);
//        System.out.println("First occurence : " + first);
//        System.out.println("Last occurence : " + last);

//        boolean present[] = new boolean[str.length()];
//        System.out.println(removeDuplicates(str, 0, present));


//        String str1 = "abc";
//        String str2 = "aaa";
//        printSubseq(str1, 0, "");

//        String str1 = "abc";
//        String str2 = "aaa";
//        HashSet<String> allSubseq = new HashSet<>();
//        printSubseq(str2, 0, "", allSubseq);

        String number = "23";
        printKeypadCombination(number, 0, "");

    }
}
