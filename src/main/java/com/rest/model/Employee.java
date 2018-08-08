package com.rest.model;

public class Employee {
	
	public Employee(long id, String empName, int empAge, String empAddress) {
		// TODO Auto-generated constructor stub
		this.empId =id;
		this.empName = empName;
		this.empAge = empAge;
		this.empAddress = empAddress;
		
	}
	
	private long empId;
	private String empName;
	private int empAge;
	private String empAddress;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "empId:"+empId +" empName:"+empName+" empAge"+empAge+" empAddress"+empAddress;
	}

}
