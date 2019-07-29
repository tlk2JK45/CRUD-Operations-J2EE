/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RegistrationAuthenticator;

/**
 *
 * @author Gaurav
 */
public class RegistrationChecker extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("registration.jsp");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username= request.getParameter("username");
        String password= request.getParameter("password");
        String cpassword= request.getParameter("cpassword");
        String city= request.getParameter("city");
        String age= request.getParameter("age");
        
        try
        {
            if(!username.isEmpty() && !city.isEmpty() && !age.isEmpty() && !password.isEmpty() && !password.equals(cpassword))
            {
                response.sendRedirect("registrationFail.jsp");
            }
        }catch(Exception e){}
        
        RegistrationAuthenticator authenticator=new RegistrationAuthenticator();
        Boolean register=authenticator.isRegister(username, password, city, age);
        
        if(register)
        {
            response.sendRedirect("login.html");
        }
        else
        {
            response.sendRedirect("registrationFail.jsp");
        }
    }
}
