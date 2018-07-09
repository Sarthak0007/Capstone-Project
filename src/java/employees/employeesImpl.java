/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;


import dbconnection.dbconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class employeesImpl implements employeesDao {

    @Override
    public void insert(employee emp) {
        System.out.println(emp.getName());
        try
        {
            Connection conn =dbconnection.getConnection();
         
            String a="insert into EMPLOYEES (name,email,phone,address) values(?,?,?,?)";
         PreparedStatement ps =conn.prepareStatement(a);
       
         
            ps.setString(1,emp.getName());
            ps.setString(2,emp.getEmail());
            ps.setString(3,emp.getPhone());
            ps.setString(4,emp.getAddress());
           
            ps.executeUpdate();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void update(employee emp) {
        
        try
        {
          Connection conn = dbconnection.getConnection();
          
          String a ="UPDATE EMPLOYEES SET name=?,email=?,phone=?,address=? WHERE id="+emp.getId();
          
          PreparedStatement ps =conn.prepareStatement(a);
          
            ps.setString(1,emp.getName());
            ps.setString(2,emp.getEmail());
            ps.setString(3,emp.getPhone());
            ps.setString(4,emp.getAddress());
            
            ps.executeUpdate();
          
          
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

    @Override
    public void delete(int id) {
        
        try
        {
            Connection conn =dbconnection.getConnection();
            
            String a = "DELETE FROM EMPLOYEES where id = ? ";
            
            PreparedStatement ps =conn.prepareStatement(a);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public employee getemployees(int id) {
     
        try
        {
          Connection conn =dbconnection.getConnection();
          
          String a ="SELECT * FROM EMPLOYEES where id = ?";
          
          PreparedStatement ps =conn.prepareStatement(a);
          
          employee pl =new employee();
          
          ps.setInt(1, id);
          
          ResultSet rs =ps.executeQuery();
          
          while(rs.next())
          {
              employee p =new employee();
              
              p.setId(rs.getInt("ID"));
              p.setName(rs.getString("NAME"));
              p.setEmail(rs.getString("EMAIl"));
              p.setPhone(rs.getString("PHONE"));
              p.setAddress(rs.getString("ADDRESS"));
              
              
              System.out.println(p.getName());      
                   System.out.println(p.getEmail());
                   return p;
          }
          
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                }
        return null;
    }

    @Override
    public List<employee> getemployees() {
     
        List<employee> list= new ArrayList<>();
        
        try
        {
            Connection conn =dbconnection.getConnection();
          
            
            String a ="SELECT * FROM EMPLOYEES";
          
            PreparedStatement ps =conn.prepareStatement(a);
          
            
            ResultSet rs = ps.executeQuery();
           
            
            while(rs.next())
          {
              employee p =new employee();
            
              p.setId(rs.getInt("ID"));
              p.setName(rs.getString("NAME"));
              p.setEmail(rs.getString("EMAIl"));
              p.setPhone(rs.getString("PHONE"));
              p.setAddress(rs.getString("ADDRESS"));
              
              
              
              System.out.println(p.getName());      
                   System.out.println(p.getPhone());
                   list.add(p);
          }
            
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
}
