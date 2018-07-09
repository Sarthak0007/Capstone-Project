/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Signup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class SignupImpl implements SignupDao {

    @Override
    public void insert(Signupbean s) {
         
        try
        {
            Connection conn =dbconnection.dbconnection.getConnection();
            
            String b ="insert into REGISTRATION(name,number,username,password,confirm_password)values(?,?,?,?,?) ";
            
            PreparedStatement ps =conn.prepareStatement(b);
            
            ps.setString(1, s.getName());
            ps.setString(2, s.getNumber());
            ps.setString(3, s.getUsername());
            ps.setString(4, s.getPassword());
            ps.setString(5, s.getConfirm_password());
            
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            
        }
    }

    @Override
    public List<Signupbean> getSignupbean() {
        
          List<Signupbean> list= new ArrayList<>();
        try
        {
          Connection conn =dbconnection.dbconnection.getConnection();
          
           String b ="SELECT * FROM REGISTRATION";
           
            PreparedStatement ps =conn.prepareStatement(b);
            
             ResultSet rs = ps.executeQuery();
             
             while(rs.next())
             {
                 Signupbean bean =new Signupbean();
                 
                 bean.setId(rs.getInt("ID"));
                 bean.setName(rs.getString("NAME"));
                  bean.setNumber(rs.getString("NUMBER"));
                   bean.setUsername(rs.getString("USERNAME"));
                    bean.setPassword(rs.getString("PASSWORD"));
                     bean.setConfirm_password(rs.getString("CONFIRM_PASSWORD"));
                     
                     System.out.println(bean.getName());      
                   System.out.println(bean.getNumber());
                   list.add(bean);
             }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Signupbean getSignupbean(int id) {
      
        try
        {
         Connection conn =dbconnection.dbconnection.getConnection();
         
        String b ="SELECT * FROM REGISTRATION  where id = ?";
        PreparedStatement ps =conn.prepareStatement(b);
        
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            Signupbean bean =new Signupbean();
            bean.setId(rs.getInt("ID"));
                 bean.setName(rs.getString("name"));
                  bean.setNumber(rs.getString("number"));
                   bean.setUsername(rs.getString("username"));
                    bean.setPassword(rs.getString("password"));
                     bean.setConfirm_password(rs.getString("confirm_password"));
                     
                     System.out.println(bean.getName());      
                   System.out.println(bean.getNumber());
                   return bean;
        }
        
         
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
}
