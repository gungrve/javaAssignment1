<%-- 
    Document   : search
    Created on : Apr 17, 2022, 9:20:02 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>
    <body>
        <h1>Search Tool</h1>
        <form action="viewParticipant.jsp">
            <pre>
                <input type="radio" id="r1" name="choice" value="all"><label for="r1">View all participant</label><br>
                <input type="radio" id="r2" name="choice" value="student"><label for="r2">View Student Participant</label><br>
                <input type="radio" id="r3" name="choice" value="normal"><label for="r3">View Normal Participant</label><br>
                <input type="submit" name="submit" value="View">

                Insert Registered Participant Name <br>
                <input type="text" name="partName"><br>
                <button href="searchPart.jsp">Search</button> <button href="removePart.jsp">Remove</button><br>
                            <a href="index.jsp">Back</a><br>
            </pre>
        </form>
    </body>
</html>
