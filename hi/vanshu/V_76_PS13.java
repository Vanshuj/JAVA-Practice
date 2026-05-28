package hi.vanshu;
class PS13 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning!");
        }
    }
}
class PS13b extends Thread{
    public void run(){
//        while(false){
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//        }
    }
}

public class V_76_PS13 {
    public static void main(String[] args) {
        PS13 p1 = new PS13();
        PS13b p2 = new PS13b();
        // p1.setPriority(6);
        // p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
//        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
