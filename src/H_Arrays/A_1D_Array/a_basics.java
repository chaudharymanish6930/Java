package H_Arrays.A_1D_Array;

public class a_basics {
    public static void main(String[]args){
        int[] marks=new int[3];
        marks[0]=19;
        marks[1]=20;
        marks[2]=30;
        System.out.println(marks); // [I@27716f4
        System.out.println(marks[1]);

        int[] name={12,24,266,23,65,289,22};
        for(int i=0;i< name.length;i++){
            System.out.println(name[i]);
        }

    }
}
