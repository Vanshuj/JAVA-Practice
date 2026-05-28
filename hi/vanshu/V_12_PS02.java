package hi.vanshu;
import java.util.Scanner;
public class V_12_PS02 {

    public static void main(String[] args) {
        // problem 1
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        // problem 2
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        //problem 3
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b>8);
        System.out.println(7*49/7+35/7);
    }
}
