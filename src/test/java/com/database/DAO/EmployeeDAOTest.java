package com.database.DAO;

import static org.junit.Assert.*;

import org.junit.Test;

import com.database.Model.Employee;
import com.database.Service.DbImplement;

public class EmployeeDAOTest {

	/*@Test
	public void addDataTest() {
		Employee employee = new Employee();
		employee.setEmployee_Name("Kona");
		employee.setEmployee_Salary(35000);
		employee.setEmployee_Country("Bangladesh");
		employee.setEmployee_City("Comilla");
		employee.setEmployee_ZipCode("+880");
		
		DbImplement dbImplement = new DbImplement();
		assertEquals(true, dbImplement.addUser(employee));
	}*/
	
	/*@Test
	public void updateDataTest() {
		
		Employee employee = new Employee();
		employee.setEmployee_ID(2);
		employee.setEmployee_Name("Sadia");
		employee.setEmployee_Salary(25000);
		employee.setEmployee_Country("Bangladesh");
		employee.setEmployee_City("Faridpur");
		employee.setEmployee_ZipCode("+880");
		
		DbImplement dbImplement = new DbImplement();
		assertEquals(true, dbImplement.upadateUser(employee));
	}
	
	@Test
	public void deleteDataTest() {
		Employee employee = new Employee();
		employee.setEmployee_ID(3);
		
		DbImplement dbImplement = new DbImplement();
		assertEquals(true, dbImplement.deleteUser(employee));
		
	}*/
	
	@Test
	public void findDataTest() {
		Employee employee = new Employee();
		employee.setEmployee_ID(2);
		employee.setEmployee_Name("Sadia");
		employee.setEmployee_Salary(25000);
		employee.setEmployee_Country("Bangladesh");
		employee.setEmployee_City("Faridpur");
		employee.setEmployee_ZipCode("+880");
	
		DbImplement dbImplement = new DbImplement();
		assertEquals(true, dbImplement.findUserById(2));
	}
	
	@Test
	public void wildCardTest() {
		//Employee employee = new Employee();
		DbImplement dbImplement = new DbImplement();
		assertEquals(true, dbImplement.nameMatch("di"));
		
	}

}
