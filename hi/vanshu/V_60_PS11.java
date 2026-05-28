package hi.vanshu;
// problem 1
abstract class Pen{
    abstract void write();
    abstract void refill();
}
 class fountainPen extends Pen{
    public void write(){
        System.out.println("Write...");
    }
    public void refill(){
        System.out.println("Refill..");
    }
    public void changeNib(){
        System.out.println("changing nib");
    }
 }

 // problem 3
class Monkey{
     void jump(){
         System.out.println("Jumping...");
     }
     void bite(){
         System.out.println("Biting...");
     }
 }

 interface basicAnimal{
    void eat();
    void sleep();
 }

 class human extends Monkey implements basicAnimal{
     void speak(){
         System.out.println("Hello sir!");
     }

     @Override
     public void eat() {
         System.out.println("Eating");
     }

     @Override
     public void sleep() {
         System.out.println("Sleeping");
     }
 }

public class V_60_PS11 {
    public static void main(String[] args) {
    // 1 + 2
        fountainPen f= new fountainPen();
        f.changeNib();

        // Q3
        human Vansh = new human();
        Vansh.sleep();

        // Q5
        Monkey m1 = new human();
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

        basicAnimal lovish = new human();
        // lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();
    }
}
