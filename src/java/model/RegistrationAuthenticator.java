/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gaurav
 */
public class RegistrationAuthenticator 
{
    public boolean isRegister(String username, String password, String city, String age)
    {
        try
        {
            Statement st=DBConnector.getStatement();
            String Query="SELECT userName FROM userData";//checking if username is already registered.         
            ResultSet rs=st.executeQuery(Query);
            while(rs.next())
            {
                if(username.equals(rs.getString(1)))
                {
                    return false; //returing false is username is already registered.
                }   
            }
            Query="INSERT INTO userData VALUES('"+username.trim()+"','"+password+"','"+city.trim()+"','"+age+"')";            
            int i=st.executeUpdate(Query); //inserting data to database as user is new.
            if(i>0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return false;
    } 
}
