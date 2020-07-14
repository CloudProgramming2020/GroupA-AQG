<%@page import="Db.DbOperations"%>
<%@page import="java.util.ArrayList"%>
<%
    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    String add = request.getParameter("add");
    String em = request.getParameter("em");
    String ph = request.getParameter("ph");
    
    
    
    ArrayList arr =new ArrayList();
    arr.add(fname);
    arr.add(lname);
    arr.add(add);
    arr.add(em);
    arr.add(ph);
    
    DbOperations dbop = new DbOperations();
    String result=dbop.addstudentInfo(arr);
    
    out.print(result);
    
    
    
%>

