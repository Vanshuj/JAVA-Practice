package hi.vanshu;

class MyThreadRunnable1 implements Runnable {
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println("I am a thread 1 not a threat 1");
        }
    }
}
class MyThreadRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println("I am a thread 2 not a threat 2");
        }
    }
}
public class V_71_Runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 a = new MyThreadRunnable1();
        Thread a1 = new Thread(a);
        MyThreadRunnable2 b = new MyThreadRunnable2();
        Thread b1 = new Thread(b);

        a1.start();
        b1.start();
    }
}
