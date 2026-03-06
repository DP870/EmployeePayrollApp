package com.Payroll;

/**
 * SalaryComponents
 * Represents the breakdown of an employee's salary.
 */
public class SalaryComponents {
    public double basicSalary;
    public double hra;
    public double da;
    public double allowances;
    public double pf;
    public double tax;
    public double netPay;

public SalaryComponents(double basicSalary, double hra, double da, double allowances) {
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
        this.allowances = allowances;
    }

public double getBasicSalary() {
	return basicSalary;
}

public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
}

public double getHra() {
	return hra;
}

public void setHra(double hra) {
	this.hra = hra;
}

public double getDa() {
	return da;
}

public void setDa(double da) {
	this.da = da;
}

public double getAllowances() {
	return allowances;
}

public void setAllowances(double allowances) {
	this.allowances = allowances;
}

public double getPf() {
	return pf;
}

public void setPf(double pf) {
	this.pf = pf;
}

public double getTax() {
	return tax;
}

public void setTax(double tax) {
	this.tax = tax;
}

public double getNetPay() {
	return netPay;
}

public void setNetPay(double netPay) {
	this.netPay = netPay;
}
}