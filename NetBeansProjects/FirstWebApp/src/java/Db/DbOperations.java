/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abhi
 */
public class DbOperations {
    
    public ResultSet viewAllStudentInformation()
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Dbconnect dbcon =new Dbconnect();
        conn = dbcon.connectdatabase();
        String SQL ="select * from webtable";
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);
        } catch (SQLException ex) {
            System.out.println("Select error"+ex.toString());
        }
        
        return rs;
        
        
    }

    public String addstudentInfo(ArrayList data)
    {
        String result="success";
        Connection conn = null;
        Dbconnect dbcon =new Dbconnect();
        conn = dbcon.connectdatabase();
        PreparedStatement ps = null;    //statement ra prepared statement hunxa
        String SQL ="insert into webtable (first_name, last_name,address,email,phone) "
                + "values(?,?,?,?,?)";
        //LHS ma jaati ota xa teti ota nai ? dine
        //pgadmin ma banako table ko jastai serially ra same name ko variable hunu parxa
        try {
            ps = conn.prepareStatement(SQL);       
            //qn mark use gareko bella matra prepared statement use garinxa
           ps.setString(1,data.get(0).toString());
            //lhs le dbms ko index bhaneko ho 
            //rhs le array ko index bhanna khojeko ho
            ps.setString(2,data.get(1).toString());
            ps.setString(3,data.get(2).toString());
            ps.setString(4,data.get(3).toString());
            ps.setLong(5,Long.parseLong(data.get(4).toString()));
            System.out.println("Data executed success");
            ps.executeUpdate();     //column haru dbms ma 1 bata start hunxa tesbaheko program ma sabai 0 bata start hunxa
        } catch (SQLException ex) {
            System.out.println("Add Student Sql Error" + ex.toString());
            result=ex.toString();
        }
        
       
        
        //dbcon.closeDBConnection();
        return result;
        
    }
    public ResultSet searchstudentInfo(String fname)
    {
        Dbconnect dbcon = new Dbconnect();
        Connection conn =null;
        PreparedStatement ps = null;
        ResultSet rs=null;
        conn=dbcon.connectdatabase();
        
        String SQL ="select * from webtable where first_name like ?";
        try {
            ps=conn.prepareStatement(SQL);
            ps.setString(1, fname+"%"); //% le tyo index bata j j suru hunxa tyo display garne
            rs=ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Search Error"+ex.toString());
        }
        return rs;
    }
    
}
