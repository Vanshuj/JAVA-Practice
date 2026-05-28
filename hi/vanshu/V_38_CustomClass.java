package hi.vanshu;

class Employee{
    int id;
    int salary;
    String name;
    public void Details(){
        System.out.println("My id is "+ id);
        System.out.println("My name is "+ name);
    }

    public int getSalary() {
        return salary;
    }
}
public class V_38_CustomClass {
    public static void main(String[] args) {
        System.out.println("This is custom class");

        Employee Vanshu= new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for H
         Vanshu.id =12;
         Vanshu.salary = 34;
         Vanshu.name = "Vanshika";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Khandelwal";

        // Printing the Attributes
        Vanshu.Details();
        john.Details();
        int salary = john.getSalary();
        System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
}
