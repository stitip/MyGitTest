package com.stiti.gittest;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setFirstName("Stiti");
		emp.setLastName("Samantray");
		emp.setDepartment("Research and Development");
		
		System.out.println("Employee \"" + emp.getEmpId() + " - " + emp.getFirstName() + " " + emp.getLastName() + "\" added successfully.");
		
		System.out.println("New change...");

	}

}
