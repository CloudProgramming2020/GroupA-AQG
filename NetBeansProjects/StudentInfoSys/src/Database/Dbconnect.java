/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abhi
 */
public class Dbconnect {
    String driver = "org.postgresql.Driver";
    String URL="jdbc:postgresql";
    String Host ="localhost";
    String port ="5432";
    String Dbname ="StudentInfosSys_DB";
    String username ="postgres";
    String password ="@bhishek";
    Connection c =null;
    public  Connection connectdatabase()
    {
        try {
            Class.forName(driver);
            String urlinfo = URL+"://"+Host+":"+port+"/"+Dbname;      //url ko laagi sabi concatinate garna ko lagi banako ho
            // it should follow sam esyntax 
            c = DriverManager.getConnection(urlinfo, username, password); //URL = ip adress+port + database name
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver error "+ex.toString());
            
        } catch (SQLException ex) {
            System.out.println("SQL or connection error" + ex.toString());
            Logger.getLogger(Dbconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(c!=null)
        {
            System.out.println(" Database is  connected succesfully");
        }
        return c;
    }
        
    public void closeDBConnection()
    {
        if(this.c!= null)
        {
            try {
                c.close();
            } catch (SQLException ex) {
                Logger.getLogger(Dbconnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
       
}


