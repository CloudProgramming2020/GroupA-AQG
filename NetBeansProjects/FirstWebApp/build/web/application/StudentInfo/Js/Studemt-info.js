$(document).ready(function(){
   $("#SubmitStudentForm").click(function (){
       
       firstname=$("#txtFirstName").val(); 
       
       lastname=$("#txtLastName").val(); 
       address=$("#txtAddress").val(); 
       phone=$("#txtPhone").val(); 
       email=$("#txtEmail").val(); 
       
       $.ajax({
           url : "/FirstWebApp/application/StudentInfo/Jsp/process-student.jsp",
           type : "POST",
           data : {
               fname :firstname,    //fname= variable  firstname=value
               lname: lastname,
               add: address,
               ph: phone,
               em: email
           },
           dataType : "html",
           success :function(msg){  //process_student ko last line lai msg jastai line ho so process-student ko last line jahile out.print hunu parxa
               alert(msg);
           },
           error :function(){
               alert("ERROR");
           }
           
       });
        
   });
   
});

