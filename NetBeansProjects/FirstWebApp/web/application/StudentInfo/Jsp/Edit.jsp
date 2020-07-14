<%-- 
    Document   : index
    Created on : Jun 3, 2018, 10:24:03 AM
    Author     : Abhi
--%>


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
        <div class="container py-3">
            <div class="card">
                <div class="card-header">
                    <h4>UPDATE STUDENT INFO</h4>
                </div>
                <div class="card-body"></div>
             <form>
                <div class="form-group">
                    <label>First Name:</label>
                    <input class=" form-control" placeholder="Enter first name"type="text" id="txtFirstName" required="required">
                </div>
                
                
                <div class="form-group">
                <label> Last Name:</label>
                <input class=" col-sm-6 form-control" type="text" id="txtLastName" required="required">
                </div>
                
                <div class="form-group">
                <label>Address:</label>
                <textarea class="col-sm-6 form-control" id="txtAddress" rows="3" ></textarea>
                </div>
                
                <div class="form-group">

                <label> Phone:</label>
                <input class="col-sm-6 form-control" type="number" id="txtPhone" required="required">
                </div>
                
                
                <div class="form-group">
                <label> Email</label>
                <input  class=" col-sm-6 form-control"type="email" id="txtEmail">
                </div>
                
                <input class="btn btn-primary btn-sm" type="update" id="UpdateStudentForm" name="update" value="Update ">
                <input  class="btn btn-danger btn-sm"type="reset" id="ResetStudentForm" name="reset" value="Reset form">
                
                
            </form>
   
                
            </div>
                    </div>
        <script src="../../../application/StudentInfo/Js/Studemt-info.js"></script>
    </body>
</html>
