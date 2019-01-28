package com.database.DAO;

import java.util.List;

import com.database.Model.Employee;

public interface EmployeeDao {
	boolean addUser(Employee user);

	boolean upadateUser(Employee user);

	boolean deleteUser(Employee user);
	
	boolean findUserById(int id);
	
	boolean nameMatch(String s);

	Employee getUser(int userId);

	List<Employee> listAll();
	

}
