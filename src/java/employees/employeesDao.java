/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.util.List;

/**
 *
 * @author User
 */
public interface employeesDao {
    
    public void insert (employee emp);
    public void update (employee emp);
    public void delete (int id);
    
    public employee getemployees(int id);
    public List<employee>getemployees();
}
