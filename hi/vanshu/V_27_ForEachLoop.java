package hi.vanshu;

public class V_27_ForEachLoop {
    public static void main(String[] args) {

        /*String [] Names = {"Vanshika" , "Vansh" , "Harry" , "Rohan"};
        System.out.println(Names.length);
        System.out.println(Names[2]);
        */

        int [] marks = {98, 45, 79, 99, 80};
        // System.out.println(marks.length);

      /*  System.out.println("printing using naive method");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("using for loop");
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }*/

      /*  System.out.println("Array in reverse order using for loop");
        for (int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }*/

        System.out.println("using for each loop");
        for (int element : marks){
            System.out.println(element);
        }
    }
}
