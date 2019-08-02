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
import model.UpdationAuthenticator;

/**
 *
 * @author Gaurav
 */
public class UpdationChecker extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("home.jsp");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username= request.getParameter("username");
        String password= request.getParameter("password");
        String conPassword= request.getParameter("conPassword");
        String oldPassword= request.getParameter("oldPassword");
        String fname= request.getParameter("fname");
        String lname= request.getParameter("lname");
        String phone= request.getParameter("phone");
        String city= request.getParameter("city");
        String age= request.getParameter("age");
        try
        {
            if(username.isEmpty() || fname.isEmpty() || lname.isEmpty() || phone.isEmpty() || city.isEmpty() || age.isEmpty() || password.isEmpty()|| oldPassword.isEmpty() || !password.equals(conPassword))
            {
                System.out.println("1");
                response.sendRedirect("updationFail.jsp"); return;
            }
        }catch(Exception e){}
        
        UserDTO user=new UserDTO();
        user.setUsername(username);
        user.setPassword(password);
        user.setOldPassword(oldPassword);
        user.setFname(fname);
        user.setLname(lname);
        user.setPhone(phone);
        user.setCity(city);
        user.setAge(age);
        
        UpdationAuthenticator authenticator=new UpdationAuthenticator();
        Boolean update=authenticator.isUpdate(user);
        
        if(update)
        {
            System.out.println("2");
            response.sendRedirect("home.jsp");
        }
        else
        {
            System.out.println("3");
            response.sendRedirect("updationFail.jsp");
        }
    }
}
