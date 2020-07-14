 
package database.connectondemo;
import java.sql.*;
import javax.swing.JOptionPane;



class DBCOnnect{
    Connection con =null;
    PreparedStatement stmt = null;
    Statement st= null;
    public DBCOnnect(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/orchid","root","");
            JOptionPane.showMessageDialog(null,"Connection Successful!" );
            st= con.createStatement();
            String Sql= "update student set address =? where roll=?";
            stmt= con.prepareStatement(Sql);
            stmt.setString(1,"abc");
            stmt.setInt(2, 3);
            stmt.executeUpdate();
            stmt.setString(1, "abcd");
            stmt.setInt(2, 4);
            stmt.executeUpdate();
           JOptionPane.showMessageDialog(null,"Update Successful!" );
           String s= "select * from student";
            
            ResultSet rs= stmt.executeQuery(s);
            while(rs.next()){
                
                System.out.println(rs.getInt("roll")+"\t"+rs.getString("name")+"\t"+rs.getString("address"));
            }
            stmt.close();
            con.close();
            st.close();
            rs.close();
            
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
    
    catch(ClassNotFoundException e){
            System.out.println(e);
    }
            
}
}

public class DatabaseDemo {
    public static void main(String[] args) {
        new DBCOnnect();
    }
    
}
