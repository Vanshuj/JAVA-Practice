package hi.vanshu;

public class V_33_Vararg {

    /*static int sum(int a,int b) {
        return a + b;
    }
    static int sum(int a,int b, int c){
            return a+b+c;
    }
    static int sum(int a,int b, int c, int d){
        return a+b+c+d;
    }
     */


    // using Vararg method

    static int sum(int ...arr){
        // Available as int [] arr
        int result = 0;
        for (int a: arr){
            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(2,3,4));
        System.out.println(sum(3,4,5,6));
    }
}
