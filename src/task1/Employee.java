package task1;

import java.time.LocalDate;
import java.util.Date;

public class Employee implements Comparable<Employee>{

	private String employeeName;
	private String departmentName;
	private double employeeSalary;
	private LocalDate DOB;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "{employeeName=" + employeeName + ", departmentName=" + departmentName + ", employeeSalary="
				+ employeeSalary + ", DOB=" + DOB + "}";
	}
	public Employee(String employeeName, String departmentName, double employeeSalary, LocalDate dOB) {
		super();
		this.employeeName = employeeName;
		this.departmentName = departmentName;
		this.employeeSalary = employeeSalary;
		this.DOB = dOB;
	}
	@Override
	public int compareTo(Employee o) {
		
		int Compare;
		
		Compare=this.getEmployeeName().compareTo(o.getEmployeeName());
		if(Compare!=0)return Compare;
		
	    Compare=this.getDepartmentName().compareTo(o.getDepartmentName());
		if(Compare!=0)return Compare;
		
	    Compare=Double.compare(this.getEmployeeSalary(),o.getEmployeeSalary());
		if(Compare!=0)return Compare;
		
	    return this.DOB.compareTo(o.DOB);
		
		
	}
	
//	public int compareTo(Employee emp2) {
//		return this.getEmployeeName().compareTo(emp2.getEmployeeName());
//	}
//	
	
}
