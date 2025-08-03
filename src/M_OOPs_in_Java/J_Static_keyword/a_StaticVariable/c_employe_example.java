package M_OOPs_in_Java.J_Static_keyword.a_StaticVariable;

class employee{
    int id;
    String Name;
    static String Company="HCL";
    employee(int id, String Name){
        this.id=id;
        this.Name=Name;
    }
    void display(){
        System.out.println("ID:"+" "+id+" "+"Name:"+" "+Name+" Company:"+Company);
    }
}
public class c_employe_example {
    public static void main(String[] args){
        employee e1= new employee(123,"Vishal");
        e1.display(); //  ID: 123 Name: Vishal Company:HCL
        employee e2= new employee(124,"Rohit");
        e2.display();  //  ID: 124 Name: Rohit Company:HCL
//      now i want to change company name
        employee.Company="Google";
        e1.display();
        e2.display();
    }
}
