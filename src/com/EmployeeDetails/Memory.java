package com.EmployeeDetails;

import java.util.*;


//Stores user data as Username ----> [Registered User details] 
//[Registered User details] is encapsulated and can only be accessed using getters and setters.

public class Memory {
	//DEFINING HASHMAP
    private final Map<String, Employee> users = new HashMap<>();
    
    //CHECKS IF USERNAME EXISTS
    public boolean exists(String username) {
        return users.containsKey(username);
    }
    
    //SAVE USER DETAILS
    public void save(Employee user) {
        users.put(user.getEmpId(), user);
    }
    
    //FIND USER
    public Employee find(String empId) {
        return users.get(empId);  //Returns the RegisteredUser details [Registered User details] 
    }
    
    //Update Password
    /*
    public boolean update(String username,String newpass,Employee user) {

    	Employee existing = users.get(username);
        if (existing == null) {   //CHECKS IF USERNAME EXISTS
        	return false; 
        }

        if (!Validator.validatePassword(newpass)) {  //Validates the new password
        	return false;
        }

        existing.setPassword(newpass);    //Updates the new password using setters and the value is automatically updated in the hashmap
        return true;

    }
    */
    

}

    
    
