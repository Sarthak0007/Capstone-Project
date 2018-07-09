/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservtion;

import java.util.List;


public interface ReservationDao {
    
    public void insert(Reservation res);
   
    public Reservation getReservation(int id);
    public List<Reservation>getReservation();
    
}
