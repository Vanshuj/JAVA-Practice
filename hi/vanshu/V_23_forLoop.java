package hi.vanshu;

public class V_23_forLoop {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("odd no:");
        // 2i = Even Numbers = 0, 2, 4, 6, 8
        // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
        int n=3;
        for (int i=0; i<=n; i++){
            System.out.println(2*i+1);
        }

        System.out.println("Reverse count");
        for (int i=5; i!=0; i--){
            System.out.println(i);
        }
    }
}
