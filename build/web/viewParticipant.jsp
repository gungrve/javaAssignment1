<%-- 
    Document   : viewParticipant
    Created on : Apr 17, 2022, 9:38:23 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Participant</title>
        <%@page import="java.sql.*;" %>
    </head>
    <body>
        <h1>View Participant</h1>
        <%
            
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/conference?autoReconnect=true&useSSL=false", "root", "1234");
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from conference.registration");

                    %>
                    <table border="1" align="center" style="text-align: center">
                        <tr>
                            <th>ID</th>
                            <th>Full name</th>
                            <th>Area</th>
                            <th>Address</th>
                            <th>City</th>
                            <th>State</th>
                            <th>Post Code</th>
                            <th>Country</th>
                            <th>Email</th>
                            <th>Phone Number</th>
                            <th>T-shirt Size</th>
                        </tr>

                    <%

                    while(rs.next()){
                        String ID = rs.getString("id");
                        String FullName = rs.getString("first_name")+" "+rs.getString("last_name");
                        String Area = rs.getString("area");
                        String Addr = rs.getString("address");
                        String City = rs.getString("city");
                        String State = rs.getString("state");
                        String Code = rs.getString("post_code");
                        String Country = rs.getString("country");
                        String Email = rs.getString("email");
                        String Pnumber = rs.getString("phone_number");
                        String Size = rs.getString("tshirt_size");
                        %>
                        <tr>
                            <td> <%= ID %> </td>
                            <td> <%= FullName %> </td>
                            <td> <%= Area %> </td>
                            <td> <%= Addr %> </td>
                            <td> <%= City %> </td>
                            <td> <%= State %> </td>
                            <td> <%= Code %> </td>
                            <td> <%= Country %> </td>
                            <td> <%= Email %> </td>
                            <td> <%= Pnumber %> </td>
                            <td> <%= Size %> </td>
                        </tr>
                        <%
                    }
                    %>
                    </table>
                    <%

                    con.close();
                } catch (Exception e) {
                    out.print(e);
                }
            
        %>
        <br/> <a href="index.jsp">Back</a>
    </body>
</html>
