package N_Exceptioanl_Handling.D_Throws_Keyword;

// import
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class ReadAndWrite{
    void readfile() throws FileNotFoundException
    {
    FileInputStream fis = new FileInputStream("d:/abc.txt");
        System.out.println("in read methods");
    }
    void saveFile() throws FileNotFoundException
    {
        String text ="this demo";
        FileOutputStream fos =new FileOutputStream("d/abc.txt");
    }
}

public class a_Basics {
    public static void main(String [] args){
        ReadAndWrite rw=new ReadAndWrite();
//        rw.readfile();
    try{
        rw.readfile();
    }
    catch(FileNotFoundException e){
        e.printStackTrace();
    }
        System.out.println("successfully executed...1");

    // for save the files
        try{
            rw.saveFile();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Successfully Executed...2");
    }

}