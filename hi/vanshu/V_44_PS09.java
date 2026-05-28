package hi.vanshu;

//problem 1
/*class cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //problem 2
    public double TSA(){
        return  2 * 3.14 *radius *(height+radius) ;
    }
    public double volume(){
        return  3.14f *radius*radius*height;
    }
}*/

class RECTANGLE{
    private int lENGTH;
    private int BREADTH;

    public RECTANGLE(){
        this.lENGTH= 4;
        this.BREADTH=5;
    }

    public RECTANGLE(int l, int b){
        this.lENGTH=l;
        this.BREADTH=b;
    }

    public int getLength() {
        return lENGTH;
    }

    public int getBreadth() {
        return BREADTH;
    }
}

public class V_44_PS09 {
    public static void main(String[] args) {
        //problem 1
//        cylinder cy= new cylinder();
//        cy.setHeight(12);
//        int h = cy.getHeight();
//        System.out.println(h);
//        cy.setRadius(8);
//        int r = cy.getRadius();
//        System.out.println(r);
//
//        //problem 2
//        System.out.println(cy.TSA());
//        System.out.println(cy.volume());

        //problem 3
        RECTANGLE rec= new RECTANGLE(12, 5);
        System.out.println(rec.getBreadth());
        System.out.println(rec.getLength());
    }
}
