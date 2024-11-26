package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import task1.Employee;

public class Application {

    public static void main(String args[]) {
    	
        List<Employee> list = new ArrayList<>();
       
        LocalDate d1 = LocalDate.of(2001, 10, 21);
        Employee e1 = new Employee("Yash", "Finance", 26000, d1);
        
        LocalDate d2 = LocalDate.of(2001, 10, 19);
        Employee e2 = new Employee("Kunal", "IT", 26000, d2);
        
        LocalDate d3 = LocalDate.of(2001, 9, 20);
        Employee e3 = new Employee("Raghav", "Finance", 35000, d3);
        
        LocalDate d4 = LocalDate.of(2001, 8, 1);
        Employee e4 = new Employee("Aakash", "Developer", 29000, d4);
        
        LocalDate d5 = LocalDate.of(2001, 10, 21);
        Employee e5 = new Employee("Yash", "HR", 40000, d5);
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

          Comparator<Employee>comp=new Comparator<Employee>()
        	{

				@Override
				public int compare(Employee o1, Employee o2) {
					int Compare;
					Compare=o1.getEmployeeName().compareTo(o2.getEmployeeName());
					if(Compare!=0)return Compare;
					
				    Compare=o1.getDepartmentName().compareTo(o2.getDepartmentName());
					if(Compare!=0)return Compare;
					
				    Compare=Double.compare(o1.getEmployeeSalary(),o2.getEmployeeSalary());
					if(Compare!=0)return Compare;
					
				    return (o1.getDOB().compareTo(o2.getDOB()));
				}
        	
        	};
        
        Collections.sort(list,comp);
        
       //Collections.sort(list);
        
        for (Employee e : list) {
            System.out.println(e.toString());
        }
    }
}
