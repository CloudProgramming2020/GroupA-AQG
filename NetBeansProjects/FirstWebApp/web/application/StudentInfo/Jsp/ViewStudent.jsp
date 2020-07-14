<%-- 
    Document   : index
    Created on : Jun 3, 2018, 10:24:03 AM
    Author     : Abhi
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Db.DbOperations"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../../../Resources/bootstrap/css/bootstrap.css" />  <%-- ../ hami student info ma gaye ../ tespaxi application ma ../ tespaxi web pages ma --%>
        <link rel="stylesheet" href="../../../application/Main/CSS/Main.css" />
        <script src="../../../Resources/Jquery/js/jquery-3.3.1.min.js"></script>
        <title>SIMS::Student Information Management System</title>
        
        
    </head>
    <body>
       <jsp:include page="../../../header.jsp" />  
       <%
            DbOperations dbopt = new DbOperations();
            ResultSet rs = dbopt.viewAllStudentInformation();
        %>
        <div class="container py-3">
            <div class="card">
                <div class="card-header">
                    <div class="label">
                    <h4>List of Students </h4>
                    </div>
                    <div>
                        <a href="http://localhost:8080/FirstWebApp/application/StudentInfo/Jsp/addStudent.jsp" class="newButtonLink"> New Student</a>
                    </div>
                        
                   
                </div>
                <div class="card-body"></div>
                <table class="table table-hover">
                    <thead>
                    <th>S.No. </th>
                    <th> Name</th>
                    <th> Email</th>
                    <th> Phone Number</th>
                    <th> Address</th>
                    <th>Action</th>
                    </thead>
                    <tbody>
                    
                        <%
                        int i=1; 
                        while(rs.next())
                        {
                            
                        
                        %>
                    
                    <tr>
                        <td><% out.print(i);%></td>
                        <td><%  out.print(rs.getString("first_name")+" "+rs.getString("last_name"));%></td>
                        <td><%  out.print(rs.getString("email"));%></td>
                        <td><%  out.print(rs.getString("phone"));%></td>
                        <td><%  out.print(rs.getString("address"));%></td>
                        <td><a class="btn newButtonLinkedit" href="Edit.jsp">Edit</a></td>
                        
                        </tr>
                        <%
                        i++;
                        }
                        %>
                        
                    </tbody>
                    
                </table>
                
            </div>
                    </div>
        <script src="../../../application/StudentInfo/Js/Studemt-info.js"></script>
    </body>
</html>
