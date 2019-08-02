/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserDTO;
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
        String fname= request.getParameter("fname");
        String lname= request.getParameter("lname");
        String phone= request.getParameter("phone");
        String city= request.getParameter("city");
        String age= request.getParameter("age");
        
        
        if(username.isEmpty() || fname.isEmpty() || lname.isEmpty()|| phone.isEmpty()|| city.isEmpty() || age.isEmpty() || password.isEmpty() || !password.equals(cpassword))
        {
            System.out.println("1");
            response.sendRedirect("registrationFail.jsp"); return;
        }
        
        UserDTO user=new UserDTO();
        user.setUsername(username);
        user.setPassword(password);
        user.setFname(fname);
        user.setLname(lname);
        user.setPhone(phone);
        user.setCity(city);
        user.setAge(age);
        
        RegistrationAuthenticator authenticator=new RegistrationAuthenticator();
        Boolean register=authenticator.isRegister(user);
        
        if(register)
        {
            System.out.println("2");
            response.sendRedirect("login.jsp");
        }
        else
        {
            System.out.println("3");
            response.sendRedirect("registrationFail.jsp");
        }
    }
}
