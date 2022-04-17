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
    </head>
    <body>
        <h1>Conference Online Registration</h1>
        <h5>Please fill in the form below. We contact you as soon as possible</h5>
        
        <form action="response.jsp">
            <pre>
                Full Name:*
                <input type="text" name="fname" placeholder="Firstname">  <input type="text" name="lname" placeholder="Lastname"><br><br>
                Area:*
                <select name="area">
                    <option value="Kuala Lumpur">Kuala Lumpur</option>
                    <option value="Johor">Johor</option>
                    <option value="Kedah">Kedah</option>
                    <option value="Sabah">Sabah</option>
                    <option value="Sarawak">Sarawak</option>
                </select><br>
                Address:*
                <input type="text" name="addrL1" placeholder="Address line 1">
                <!--<input type="text" name="addrL2" placeholder="Address line 2"><br>-->
                <input type="text" name="addrCity" placeholder="City">  <input type="text" name="addrState" placeholder="State"><br>
                <input type="text" name="addrCode" placeholder="Postal Code">  Country: <select name="addrCountry">
                    <option value="Malaysia">Malaysia</option>
                    <option value="Singapore">Singapore</option>
                    <option value="Brunei">Brunei</option>
                    <option value="Indonesia">Indonesia</option>
                </select>
                
                Email:*
                <input type="email" name="email" placeholder="ex: myname@example.com">

                Phone Number:*
                <input type="text" name="phone">

                First time to attend this conference?*
                <select name="choice">
                    <option value="Yes">Yes</option>
                    <option value="No">No</option>
                </select>

                I will attend: *
                <input type="checkbox" name="date" value="Date 1">Date 1
                <input type="checkbox" name="date" value="Date 2">Date 2
                <input type="checkbox" name="date" value="Date 3">Date 3

                What's your t-shirt size?
                <select name="size">
                    <option value="s">S</option>
                    <option value="m">M</option>
                    <option value="l">L</option>
                    <option value="xl">XL</option>
                </select>

                <!--Registration fee:*

                <input type="radio" id="fee1" name="regfee" value="500"><label for="fee1">Conference Registration <b>500.00 MYR</b></label>
                <input type="radio" id="fee1" name="regfee" value="500"><label for="fee1">Student Registration <b>300.00 MYR</b></label>
                
                <a href="calculate.jsp">Calculate</a>-->
                <a href="search.jsp" name="search">Search Tool</a> <input type="submit" name="submit"> <input type="reset" name="reset">
            </pre>
            
        </form>
    </body>
</html>
