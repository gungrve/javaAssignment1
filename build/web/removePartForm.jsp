<%-- 
    Document   : removePartForm
    Created on : Apr 22, 2022, 1:40:43 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="removePart.jsp">
            <pre style="font-family: 'Avenir', Verdana, sans-serif; font-size: 15px">
                Insert Registered Participant Name <br>
                <input type="text" name="partName"> <br>
                <input type="submit" value="Remove"> <a href="search.jsp">Back</a> <a href="index.jsp">Home</a>
            </pre>
        </form>
    </body>
</html>
