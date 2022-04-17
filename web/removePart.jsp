<%-- 
    Document   : removePart
    Created on : Apr 17, 2022, 9:38:59 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Participant</title>
        <%@page import="java.sql.*;" %>
    </head>
    <body>
        <h1>Remove Participant</h1>
        <%
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/conference?autoReconnect=true&useSSL=false", "root", "1234");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("DELETE FROM registration WHERE first_name ='"+partName+"'");
            
        }catch(Exception e){
            out.print(e);
        }
        %>
    </body>
</html>
