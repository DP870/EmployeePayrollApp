package com.EmployeeDetails;
import com.EmployeeDetails.Employee;
import com.EmployeeDetails.Memory;

	
public class BasicAuth implements Authentication {

	    private final Employee registeredUser;
	    private final Memory memory;
	    
	    //CONSTRUCTOR INJECTION
	    // THIS IS DONE TO MAKE SURE THE SAME HASHMAP IS USED AND A NEW ONE IS NOT CREATED.
	    // this. makes it clear to the class and other methods where to get the data for the registered user and memory from.
	    public BasicAuth(Employee user,Memory usermemory) { 
	        this.registeredUser = user;
	        this.memory=usermemory;
	    }

	   
	    
	   public boolean login(String username, String password) {
		   
	    if (!registeredUser.getName().equals(username)) {
	          System.out.println("Invalid username!");
	         return false;
	    }
	    
	    
	    if (!registeredUser.getPass().equals(Hash.hash(password))) {
	       
	       return false;
	    }
	    if (memory.exists(username)){
	    	System.out.println("Login successful!");
	     return true;
	    }
	    return false;
	}
	}
	    

