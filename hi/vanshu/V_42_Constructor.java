package hi.vanshu;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
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
public class V_42_Constructor {
    public static void main(String[] args) {
//        MyMainEmployee Bhoomi = new MyMainEmployee("Bhoomi", 12);
        MyMainEmployee Bhoomi = new MyMainEmployee();
        Bhoomi.setName("Bhoomi");
        Bhoomi.setId(34);
        System.out.println(Bhoomi.getId());
        System.out.println(Bhoomi.getName());
    }
}
