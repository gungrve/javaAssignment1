<%-- 
    Document   : response
    Created on : Apr 17, 2022, 8:45:17 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data Inserted</title>
        <%@page import="java.sql.*;" %>
    </head>
    <body>
        <%
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String area=request.getParameter("area");
        String addr1=request.getParameter("addrL1");
        String city=request.getParameter("addrCity");
        String state=request.getParameter("addrState");
        String pcode=request.getParameter("addrCode");
        String country=request.getParameter("addrCountry");
        String email=request.getParameter("email");
        String phone=request.getParameter("phone");
        String choice=request.getParameter("choice");
        String eventDate=request.getParameter("date");
        String size=request.getParameter("size");
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/conference?autoReconnect=true&useSSL=false", "root", "1234");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into conference.registration (first_name,last_name,area,address,city,state,post_code,country,email,phone_number,first_time,event_attend,tshirt_size) values ('"+fname+"','"+lname+"',"
                    + "'"+area+"','"+addr1+"','"+city+"','"+state+"','"+pcode+"','"+country+"','"+email+"',"
                    + "'"+phone+"','"+choice+"','"+eventDate+"','"+size+"')");
            out.println("Data inserted");
            con.close();
            
        }catch(Exception e){
            out.print(e);
        }
        
        %>
        <br/><a href="index.jsp">Back</a>
        <br/><a href="search.jsp">Search tool</a>
    </body>
</html>
