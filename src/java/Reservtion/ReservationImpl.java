
package Reservtion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ReservationImpl implements ReservationDao {

    @Override
    public void insert(Reservation res) {
        try
        {
         Connection conn =dbconnection.dbconnection.getConnection();
         
         String c ="insert into reserve(name,email,phone,date,time,message)values(?,?,?,?,?,?)";
         
            PreparedStatement ps =conn.prepareStatement(c);
            
            ps.setString(1, res.getName());
            ps.setString(2, res.getEmail());
            ps.setString(3, res.getPhone());
            ps.setString(4, res.getDate());
            ps.setString(5, res.getTime());
            ps.setString(6, res.getMessage());
            
            ps.executeUpdate();
         
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public Reservation getReservation(int id) {
        
        try
        {
            Connection conn =dbconnection.dbconnection.getConnection();
            
            String c ="Select * from reserve where id=?";
            
            PreparedStatement ps =conn.prepareStatement(c);
            
            Reservation res =new Reservation();
            
            ps.setInt(1, id);
            
            ResultSet rs =ps.executeQuery();
            
            while (rs.next())
            {
                Reservation rese =new Reservation();
                
                rese.setId(rs.getInt("ID"));
              rese.setName(rs.getString("NAME"));
              rese.setEmail(rs.getString("EMAIL"));
              rese.setPhone(rs.getString("PHONE"));
              rese.setDate(rs.getString("DATE"));
              rese.setTime(rs.getString("TIME"));
              rese.setMessage(rs.getString("MESSAGE"));
              
              System.out.println(rese.getName());      
                   System.out.println(rese.getEmail());
                   return rese;
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Reservation> getReservation() {
        
        List<Reservation> list = new ArrayList<>();
        try
        {
         Connection conn =dbconnection.dbconnection.getConnection();
         
         String c ="Select * from RESERVE";
         
         PreparedStatement ps =conn.prepareStatement(c);
            
            ResultSet rs =ps.executeQuery();
            
            while (rs.next())
            {
                Reservation rese =new Reservation();
                
                rese.setId(rs.getInt("ID"));
              rese.setName(rs.getString("NAME"));
              rese.setEmail(rs.getString("EMAIL"));
              rese.setPhone(rs.getString("PHONE"));
              rese.setDate(rs.getString("DATE"));
              rese.setTime(rs.getString("TIME"));
              rese.setMessage(rs.getString("MESSAGE"));
              
              System.out.println(rese.getName());      
                   System.out.println(rese.getEmail());
                   list.add(rese);
         
        }
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
    
    }
    
