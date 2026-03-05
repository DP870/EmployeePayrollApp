package com.EmployeeDetails;

import java.util.regex.Pattern;

public class Validator {
	public static boolean validateEmail(String email){
		//Validates of email
		if(!Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$",email)) {
			return false;
		}
		return true;
	}
	public static boolean validatePhone(String phone) {
		// Validation of phone
		if(!Pattern.matches("^[6-9]\\\\d{9}$",phone)) {
			return false;
		}
		return true;
	}
	public static boolean validateEmpId(String empId){
		//Validation of EmployeeID
		if(!Pattern.matches("^(?i)EMP\\\\d{4}$",empId)) {
			return false;
		}
		return true;
	}
	
	public static boolean validatePassword(String pass){
		//Validation of Password
		if(!Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$",pass)) {
			return false;
		}
		return true;
	}
	
	
}
