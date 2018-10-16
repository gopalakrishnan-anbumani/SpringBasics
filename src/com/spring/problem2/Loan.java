package com.spring.problem2;

public class Loan {	
	private int loanId;	
	private int empId;
	private double amount;
	private double emi;
	private int noOfInsatllment;
	private double balance;
	/** The status. It can be either "open" or "closed" state */
	private String status;
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public int getNoOfInsatllment() {
		return noOfInsatllment;
	}
	public void setNoOfInsatllment(int noOfInsatllment) {
		this.noOfInsatllment = noOfInsatllment;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
