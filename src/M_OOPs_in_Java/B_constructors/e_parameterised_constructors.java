package M_OOPs_in_Java.B_constructors;

public class e_parameterised_constructors {
    String name;
    int roll;
    e_parameterised_constructors(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    public static void main(String[] args){
    e_parameterised_constructors ab=new e_parameterised_constructors("Manish",239);
        System.out.println("Name: "+ab.name+" "+"Roll no: "+ab.roll);
    }
}
