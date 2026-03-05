package com.EmployeeDetails;

import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int loop=1;
		Memory usermemory=new Memory();
		
		 
		while (loop==1) {
			
			//MENU 
			System.out.println("Employee Payroll App");
			System.out.println("1. Employee Registration"); 
			System.out.println("0. Exit");

			int choice= sc.nextInt();
			if (choice==1) {
				System.out.println("Enter empId: ");
				String id = sc.next();

				System.out.println("Enter name: ");
				String name = sc.next();

				System.out.println("Enter email: ");
				String email = sc.next(); 
				
				System.out.println("Enter password: ");
				String pass = sc.next(); 

				 //VALIDATE PASSWORD
				 //Checks if the password matches and if the password is validated using the PasswordValidator Class.
					if (Validator.validateEmail(email) || Validator.validatePhone(email) || Validator.validateEmpId(id)) {
						Employee emp=new Employee(id,name,email,pass);
						usermemory.save(emp);  
						System.out.println("Account Created Successfully");
		
					}
					else {
						System.out.println("Please check details entered.");
					}
				}
				
	
			
			System.out.println("Do you want to exit ?");
			loop=sc.nextInt();
			}
		}
	}
