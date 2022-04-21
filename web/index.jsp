<%-- 
    Document   : index
    Created on : Apr 17, 2022, 2:55:37 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conference Online Registration</title>
        <%@page import="java.lang.Math.*;" %>
    </head>
    <body>
        <h1>Conference Online Registration</h1>
        <h5>Please fill in the form below. We'll contact you as soon as possible</h5>
        
        <form action="response.jsp">
            
            <pre style="font-family: 'Avenir', Verdana, sans-serif; font-size: 15px">
                <b>Full Name:*</b><br>
                <input type="text" name="fname" placeholder="Firstname">  <input type="text" name="lname" placeholder="Lastname"><br>
                <b>Area:*</b><br>
                <select name="area">
                    <option value="North">North</option>
                    <option value="South">South</option>
                    <option value="East">East</option>
                    <option value="West">West</option>
                </select><br>
                <b>Address:*</b><br>
                <input type="text" name="addrL1" placeholder="Address line 1">
                <!--<input type="text" name="addrL2" placeholder="Address line 2"><br>-->
                <input type="text" name="addrCity" placeholder="City">&nbsp;&nbsp;<input type="text" name="addrState" placeholder="State"><br>
                <input type="text" name="addrCode" placeholder="Postal Code">  Country: <select name="addrCountry">
                    <option value="Malaysia">Malaysia</option>
                    <option value="Singapore">Singapore</option>
                    <option value="Brunei">Brunei</option>
                    <option value="Indonesia">Indonesia</option>
                </select>
                
                <b>Email:*</b><br>
                <input type="email" name="email" placeholder="ex: myname@example.com">

                <b>Phone Number:*</b><br>
                <input type="text" name="phone" placeholder="ex. 012-3245678">

                <b>First time to attend this conference?*</b><br>
                <select name="choice">
                    <option value="Yes">Yes</option>
                    <option value="No">No</option>
                </select>

                <b>I will attend: *</b><br>
                <input type="checkbox" name="date" value="Date 1">Date 1
                <input type="checkbox" name="date" value="Date 2">Date 2
                <input type="checkbox" name="date" value="Date 3">Date 3

                <b>What's your t-shirt size?</b><br>
                <select name="size">
                    <option value="s">S</option>
                    <option value="m">M</option>
                    <option value="l">L</option>
                    <option value="xl">XL</option>
                </select><br>

                <b>Participant Type:*</b>
                <input id="stud" type="radio" name="partiType" value="Student"><label for="stud">Student Participant</label>
                <input id="norm" type="radio" name="partiType" value="Normal"><label for="norm">Normal Participant</label>
                <a href="search.jsp" name="search">Search Tool</a> <input type="submit" name="submit"> <input type="reset" name="reset">
            </pre>
            
        </form>
        <form action="index.jsp">
            
            <pre style="font-family: 'Avenir', Verdana, sans-serif; font-size: 15px">
                <b>Registration Fee:*</b><br>
                    <input type="radio" id="fee1" name="regfee" value="300"><label for="fee1">Conference Registration Fee (Student Participant) <b>300.00 MYR</b>
                    # of Papers<select name="number">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select></label><br>
                    <input type="radio" id="fee1" name="regfee" value="500"><label for="fee1">Conference Registration Fee (Normal Participant) <b>500.00 MYR</b>
                    # of Papers<select name="number">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select></label><br>
                    <input type="submit" href="calculate.jsp" value ="Calculate"> Total <input type="text" name="result" disabled="disabled" value ='<% 
                        
                         String num1 = request.getParameter("regfee");
                         String num2 = request.getParameter("number");
                         
                         int a = Integer.parseInt(num1);
                         int b = Integer.parseInt(num2);
                         
                         int result = a*b;
                        
                        out.println(result); %>' />
            </pre>
        </form>
        
    </body>
</html>
