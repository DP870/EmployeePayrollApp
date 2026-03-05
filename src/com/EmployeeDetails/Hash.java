package com.EmployeeDetails;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Hash {
	    
	    public static String hashPassword(String password) throws NoSuchAlgorithmException {
	        if (password == null) {
	            throw new IllegalArgumentException("Password cannot be null");
	        }

	       
	        MessageDigest md = MessageDigest.getInstance("SHA-256");

	        byte[] hashBytes = md.digest(password.getBytes());

	        StringBuilder hexString = new StringBuilder();
	        for (byte b : hashBytes) {
	            String hex = Integer.toHexString(0xff & b);
	            if (hex.length() == 1) hexString.append('0'); // pad with leading zero
	            hexString.append(hex);
	        }

	        return hexString.toString();
	    }


	}

