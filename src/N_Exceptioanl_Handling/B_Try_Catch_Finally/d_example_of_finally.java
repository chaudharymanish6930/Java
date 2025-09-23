package N_Exceptioanl_Handling.B_Try_Catch_Finally;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class d_example_of_finally {
    public static void main(String[] args){
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            int a=10, b=0;
            int c=a/b;

        }
        catch(Exception ex){
            System.out.println(ex);
        }
        finally{
            try{
                rs.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
            try{
                ps.close();
            }
            catch(Exception ee){
                System.out.println(ee);
            }
        }
    }
}
