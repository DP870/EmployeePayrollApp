package com.EmployeeDetails;
import com.Payroll.*;
/**
 * Payslip
 * Represents a monthly salary statement combining employee and salary data.
 * 
 */
public class Payslip {
    private Employee employee;
    private SalaryComponents components;
    private String month;

    /**
     * Constructs a payslip with aggregated and composed data.
     * @param employee The employee receiving the payslip
     * @param components The calculated salary components
     * @param month The month of the payslip
     */
    public Payslip(Employee employee, SalaryComponents components, String month) {
        this.employee = employee;
        this.components = components;
        this.month = month;
    }

    @Override
    public String toString() {
        return "PAYSLIP"
             + "Month         : " + month + "\n"
             + "Employee ID   : " + employee.getEmpId() + "\n"
             + "Employee Name : " + employee.getName() + "\n\n"
             + "Earnings ----\n"
             + "Basic Salary  : " + components.basicSalary + "\n"
             + "HRA           : " + components.hra + "\n"
             + "DA            : " + components.da + "\n"
             + "Allowances    : " + components.allowances + "\n\n"
             + "Deductions ----\n"
             + "PF            : " + components.pf + "\n"
             + "Tax           : " + components.tax + "\n\n"
             + "Net Pay       : " + components.netPay + "\n"
             + "===============================\n";
    }
}