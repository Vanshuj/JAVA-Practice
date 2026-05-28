package hi.vanshu;

// problem 1
class Employee1{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

//problem 2
class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void Vib(){
        System.out.println("Vibrating...");
    }
    public void call(){
        System.out.println("Calling...");
    }
}

// problem 3
class Square{
    int side;

    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}


// problem 4
class Rectangle{
    int l, b;

    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2 *(l+ b);
    }
}
//problem5
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

// problem 6
class Circles{
    int r;

    public float area(){
        return 3.14f * r *r ;
    }
    public float perimeter(){
        return 2 * 3.14f * r ;
    }
}
public class V_39_PS08 {
    public static void main(String[] args) {
        // Problem 1
        /*Employee1 Vanshu = new Employee1();
        Vanshu.setName("Vanshika");
        Vanshu.salary = 233;
        System.out.println(Vanshu.getSalary());
        System.out.println(Vanshu.getName());*/

        //problem 2
       /* cellPhone Vivo = new cellPhone();
        Vivo.ring();
        Vivo.Vib();
        Vivo.call();*/

        // problem 3
        /*Square sq = new Square();
        sq.side =6;
        System.out.println("Area: "+ sq.area());
        System.out.println("Perimeter :"+ sq.perimeter());*/

        // problem 4
        /*Rectangle rec = new Rectangle();
        rec.l =3;
        rec.b = 2;
        System.out.println("Area: "+ rec.area());
        System.out.println("Perimeter :"+ rec.perimeter());*/

        // problem 5
        /*Tommy play= new Tommy();
        play.hit();
        play.run();
        play.fire();*/

        // problem 6
        Circles cir = new Circles();
        cir.r =3;

        System.out.println("Area: "+ cir.area());
        System.out.println("Perimeter :"+ cir.perimeter());
    }
}
