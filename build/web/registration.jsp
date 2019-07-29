<%-- 
    Document   : registration
    Created on : 14 Jul, 2019, 10:07:47 AM
    Author     : Gaurav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <%--To check that user is already logged-in otherwise redirect to login page--%>
        <%
           String username=(String)session.getAttribute("username");
           if(username!=null)
           {
               response.sendRedirect("home.jsp");
           }
        %>
        <center><h2>Enter Details -</h2>
        <form action="RegistrationChecker" method="post">
            <table>
                <tr>
                    <td><B>Username:</B></td>
                    <td><input type="text" name="username" placeholder="Enter Username Here"></td>
                </tr>
                <tr>
                    <td><B>Password:</B></td>
                    <td><input type="password" name="password" placeholder="Enter Password Here"></td>
                </tr>
                <tr>
                    <td><B>Confirm Password:</B></td>
                    <td><input type="password" name="cpassword" placeholder="Re-enter Password Here"></td>
                </tr>
                <tr>
                    <td><B>City:</B></td>
                    <td><input type="text" name="city" placeholder="Enter City Here"></td>
                </tr>
                <tr>
                    <td><B>Age:</B></td>
                    <td><input type="number" name="age" placeholder="Enter Age Here"></td>
                </tr>
                <tr>
                    <td><input type="reset"></td>
                    <td><input type="submit" value="Register"></td>
                </tr>
            </table>
        </form><br><br>
        <p><B>Note:</B> 1.Make sure your 'Password' and 'Confirm Password' fields contain same value.<br>
            2.Your username should be unique.<br>
            <B>Failure of above statements will lead to registration failure.</B></p>
        <br><br><h3>Already a Registered User?... <a href="login.html">Click here to Login</a></h3>
        </center>
    </body>
</html>
