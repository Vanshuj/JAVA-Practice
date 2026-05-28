package hi.vanshu;


class Panda{
    int a;
    public int get (){
        return a;
    }
    Panda(int a){
        this.a = a;
    }
}

class superPanda extends Panda{
    superPanda(int c){
        super(c);
        System.out.println("I m a super panda");
    }
}
public class V_47_This_SuperKeywords {
    public static void main(String[] args) {
        Panda p = new Panda(30);
        superPanda sp =new superPanda(5);
        System.out.println(p.get());
    }
}
