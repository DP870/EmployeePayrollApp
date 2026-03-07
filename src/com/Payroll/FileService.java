package com.Payroll;

import com.EmployeeDetails.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

//Handles saving payslip data to external files.

public class FileService {
 
    private static int fileCounter = 1000;

    public String savePayslip(Payslip pay) throws IOException {
        fileCounter++; // Increasing counter of text file
        String fileName = "data/Payslip_" + pay.getEmployee().getEmpId() + "_" + fileCounter + ".txt";
        
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(pay.toString());
        }
        return fileName;
    }

 
    public String savePayslipAsPdf(Payslip pay) throws IOException {
        fileCounter++; 
        String fileName = "data/Payslip_" + pay.getEmployee().getEmpId() + "_" + fileCounter + ".pdf";
        
                try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(pay.toString());
        }
        return fileName;
    }


	public List<Double> getSavedNetPays(String empId) {
		
		return null;
	}


	public String getempId(String username) {
		
		return null;
	}
}