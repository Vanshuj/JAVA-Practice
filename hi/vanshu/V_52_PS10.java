package hi.vanshu;



//Problem 1
class Circle{
    public int radius;
    Circle(){

        System.out.println("I am non param of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

//Problem 2
class rectangle{
    public int len,bred;
    rectangle(int l, int b){
        System.out.format("length is %d and breadth is %d",l,b);
        this.len= l;
        this.bred=b;
    }
}
class Cuboide extends rectangle {
    public int len, bred, height;

    Cuboide(int l, int b, int h) {
        super(l, b);
        System.out.println("cuboide");
        this.len = l;
        this.bred = b;
        this.height = h;
    }

    public int area() {
        return 2 * (len * bred + bred * height + height * len);
    }
}
    public class V_52_PS10 {
        public static void main(String[] args) {
            // Problem 1
            // Circle objC = new Circle(12);
            Cylinder1 obj = new Cylinder1(12, 4);
            System.out.println(obj.volume());
            System.out.println(obj.area());
            // problem 2

            Cuboide o = new Cuboide(2, 6, 4);
            System.out.println(o.area());
        }
    }

