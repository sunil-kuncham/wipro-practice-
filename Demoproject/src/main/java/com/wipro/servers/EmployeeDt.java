package com.wipro.servers;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

	public class EmployeeDt {
	    public void addEmployee(Employee employee) {
	        String query = "INSERT INTO employeemanagement (id,name,salary) VALUES (?, ?, ?)";
	        try (Connection connection = EmployeeDB.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	            preparedStatement.setInt(1, employee.getId());
	            preparedStatement.setString(2, employee.getName());
	            preparedStatement.setInt(3, employee.getSalary());
	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	        
	        
	        
	        
	     
	            public Employee getEmployeeById(int id) {
	                String query = "SELECT * FROM employeemanagement WHERE id = ?";
	                Employee employee = null;
	                try (Connection connection = EmployeeDB.getConnection();
	                     PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	                    preparedStatement.setInt(1, id);
	                    ResultSet resultSet = preparedStatement.executeQuery();
	                    if (resultSet.next()) {
	                        employee = new Employee(
	                            resultSet.getInt("id"),
	                            resultSet.getString("name"),
	                            resultSet.getInt("salary"));
	                            
	                
	                    }
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	                return employee;
	            }
	           /** public List<Employee> getAllEmployees() throws SQLException {
	                String query = "SELECT * FROM employeemanagement";
	             /**   List<Employee> employees = new ArrayList<>();
	                try (Connection connection = EmployeeDB.getConnection();
	                     Statement statement = connection.createStatement();
	                     ResultSet resultSet = statement.executeQuery(query)) {
	                    while (resultSet.next()) {
	                        Employee employee = new Employee();
	                        employee.setId(resultSet.getInt("id"));
	                        employee.setName(resultSet.getString("name"));
	                       	employee.setSalary(resultSet.getInt("salary"));
	                        employees.add(employee);
	                    }
	                }
	                return employees;
	            }**/
	            
	            
	            public void updateEmployee(Employee employee) {
	                String query = "UPDATE employeemanagement SET name = ?, salary=? WHERE id = ?";
	                try (Connection connection = EmployeeDB.getConnection();
	                     PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	                	preparedStatement.setInt(1, employee.getId());
	                    preparedStatement.setString(2, employee.getName());
	                    preparedStatement.setInt(3, employee.getSalary());
	                 	preparedStatement.executeUpdate();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	            
	            
	            
	            public void deleteEmployee(int id) {
	                String query = "DELETE FROM employeemanagement WHERE id = ?";
	                try (Connection connection = EmployeeDB.getConnection();
	                     PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	                    preparedStatement.setInt(1, id);
	                    preparedStatement.executeUpdate();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	            
	            
	            
	        
	    }




