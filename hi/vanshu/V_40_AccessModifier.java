package hi.vanshu;
class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}


public class V_40_AccessModifier {
    public static void main(String[] args) {
        MyEmployee Vanshu = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        Vanshu.setName("VANSHIKA");
        System.out.println(Vanshu.getName());
        Vanshu.setId(234);
        System.out.println(Vanshu.getId());
    }
}
