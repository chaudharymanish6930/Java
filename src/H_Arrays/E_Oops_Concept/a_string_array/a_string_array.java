package H_Arrays.E_Oops_Concept.a_string_array;

class Students {
    int rollNo;
    String name;
    double marks;

}
public class a_string_array {
    public static void main(String[] args){
        Students s1 = new Students();
        s1.rollNo=1;
        s1.name="navin";
        s1.marks=89;

        Students s2 = new Students();
        s2.rollNo=2;
        s2.name="priya";
        s2.marks=33;

        Students s3 = new Students();
        s3.rollNo=3;
        s3.name="rohit";
        s3.marks=67;

        Students s4 = new Students();
        s4.rollNo=4;
        s4.name="manish";
        s4.marks=75;

        System.out.println("name: "+s1.name+" "+s1.marks);

        // create the array of the students
        Students students[] = new Students[4];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name + " : "+students[i].marks );
        }
    }
}
