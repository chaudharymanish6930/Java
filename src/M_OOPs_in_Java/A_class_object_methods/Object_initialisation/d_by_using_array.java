package M_OOPs_in_Java.A_class_object_methods.Object_initialisation;


class Student {
    int rollNo;
    String name;
    double marks;

}

public class d_by_using_array {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.rollNo=1;
        s1.name="navin";
        s1.marks=89;

        Student s2 = new Student();
        s2.rollNo=2;
        s2.name="priya";
        s2.marks=33;

        Student s3 = new Student();
        s3.rollNo=3;
        s3.name="rohit";
        s3.marks=67;

        Student s4 = new Student();
        s4.rollNo=4;
        s4.name="manish";
        s4.marks=75;

        System.out.println("name: "+s1.name+" "+s1.marks);

        // create the array of the students
        Student students[] = new Student[4];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name + " : "+students[i].marks );
        }

        // here important for each loops

        for(Student n: students){
            System.out.println(n.name+" "+n.marks);
        }
    }
}
