import java.sql.*;
class Main{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/libmanagementdb","root","bercan2003");
//here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from books");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}  