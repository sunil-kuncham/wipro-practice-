package com.wipro.servers;

	import java.util.Scanner;

	public class EmployeeManagementApp {
	    private static Scanner scanner = new Scanner(System.in);
	    private static EmployeeDt employeeDt = new EmployeeDt();

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("Employee Management System");
	            System.out.println("1. Add Employee");
	            System.out.println("2. View Employee");
	            System.out.println("3. Update Employee");
	            System.out.println("4. Delete Employee");
	           
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            

	            switch (choice) {
	                case 1:
	                    addEmployee();
	                    break;
	                case 2:
	                    viewEmployee();
	                    break;
	                case 3:
	                    updateEmployee();
	                    break;
	                case 4:
	                    deleteEmployee();
	                    break;
	                
	                case 5:
	                    System.exit(0);
	                    break;
	                
	                	
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    public static void addEmployee() {
	        System.out.print("Enter employee details ");
	        int id = scanner.nextInt();
	        
	        String name = scanner.next();
	        
	        int salary = scanner.nextInt();
	        
	        
	        

	        Employee employee = new Employee(id,name,salary);
	        employeeDt.addEmployee(employee);
	        System.out.println("Employee added successfully!");
	    }

	    public static void viewEmployee() {
	        System.out.print("Enter employee ID: ");
	        int id = scanner.nextInt();
	        Employee employee = employeeDt.getEmployeeById(id);
	        if (employee != null) {
	            System.out.println("ID: " + employee.getId());
	            System.out.println("Name: " + employee.getName());
	            System.out.println("Salary: " + employee.getSalary());
	            	        } else {
	            System.out.println("Employee not found.");
	        }
	    }

	    public static void updateEmployee() {
	        System.out.print("Enter employee id ");
	        int id = scanner.nextInt();
	        String name = scanner.next();
	        int salary = scanner.nextInt();
	        Employee employee = new Employee(id, name,salary);
	        employeeDt.updateEmployee(employee);
	        System.out.println("Employee details updated successfully!");
	    }

	    public static void deleteEmployee() {
	        System.out.print("Enter employee ID: ");
	        int id = scanner.nextInt();
	        employeeDt.deleteEmployee(id);
	        System.out.println("Employee deleted successfully!");
	    }
	    
	 
	}



