/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Signup;

import java.util.List;

/**
 *
 * @author User
 */
public interface SignupDao {
    
    public void insert (Signupbean s);
     public Signupbean getSignupbean(int id);
    public List<Signupbean>getSignupbean();
    
}
