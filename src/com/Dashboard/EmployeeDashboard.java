package com.Dashboard;


import com.EmployeeDetails.*;

import com.Payroll.*;

import java.util.List;

/**
 * EmployeeDashboard
 * Renders the employee-specific view and personal metrics dynamically.
 */
public class EmployeeDashboard implements Dashboard {

    private Session session;


	@Override
    public void displayMenu(Session session) {
        
		System.out.println("\n======= " + session.getRole() + " DASHBOARD =======");

        displayMetrics(session.getUsername());
        System.out.println("1. Generate & Download Payslip");
        System.out.println("2. Update Profile");
        System.out.println("3. Log Out");
    }
    private void displayMetrics(String username) {
        FileService fileService = new FileService();
        
        String empId = fileService.getempId(username);
        List<Double> personalNetPays = fileService.getSavedNetPays(empId);
        double ytdEarnings = personalNetPays.stream()
                                            .mapToDouble(Double::doubleValue)
                                            .sum();
                                                  
        System.out.println("ytdEarnings");
        
    }
}