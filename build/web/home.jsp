<%-- 
    Document   : home
    Created on : 11 Jul, 2019, 6:00:24 PM
    Author     : Gaurav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <%--To check that user is already logged-in otherwise redirect to login page--%>
        <%
           String username=(String)session.getAttribute("username");
           if(username==null || username.trim().equals(""))
           {
               response.sendRedirect("login.html");
           }
        %>
        <a href="logout.jsp">Sign Out</a>
        <h1>Hello <%=username%>!</h1>
        <h2>Login successful!</h2>
    </body>
</html>
