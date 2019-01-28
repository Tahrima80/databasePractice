package com.database.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.database.Model.Employee;

public class DbOperation {
	
	public void addData(Employee user) throws SQLException{
		DbConnection connection = DbConnection.getInstance();
		
		Connection dbConnection = connection.getConnection();
		
		String insertData = "INSERT INTO [dbo].[EmployeeT_Tahrima]"
				+ "(Emp_Name, Emp_Salary, Emp_Country, Emp_City, Emp_ZipCode) VALUES"
				+ "(?, ?, ?, ?, ?)";
		
		PreparedStatement preparedStatement = dbConnection.prepareStatement(insertData);
		preparedStatement.setString(1, user.getEmployee_Name());
		preparedStatement.setInt(2, user.getEmployee_Salary());
		preparedStatement.setString(3, user.getEmployee_Country());
		preparedStatement.setString(4, user.getEmployee_City());
		preparedStatement.setString(5, user.getEmployee_ZipCode());
		preparedStatement .execute();
	}
	
	public void updateData(Employee user) throws SQLException{
        DbConnection connection = DbConnection.getInstance();
		
		Connection dbConnection = connection.getConnection();
		
		String updateData = "UPDATE [dbo].[EmployeeT_Tahrima]" 
				+ "SET Emp_Name = ?, Emp_Salary = ?, Emp_Country = ?, Emp_City = ?,"
				+ "Emp_ZipCode = ? WHERE Emp_ID = ?";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(updateData);
		
		preparedStatement.setString(1, user.getEmployee_Name());
		preparedStatement.setInt(2, user.getEmployee_Salary());
		preparedStatement.setString(3, user.getEmployee_Country());
		preparedStatement.setString(4, user.getEmployee_City());
		preparedStatement.setString(5, user.getEmployee_ZipCode());
		preparedStatement.setInt(6, user.getEmployee_ID());
		preparedStatement .execute();
	}
	
	public void deleteData(Employee user) throws SQLException{
        DbConnection connection = DbConnection.getInstance();
		
		Connection dbConnection = connection.getConnection();
		
		String deleteData = "DELETE [dbo].[EmployeeT_Tahrima] WHERE Emp_ID = ?";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(deleteData);
		
		preparedStatement.setInt(1, user.getEmployee_ID());
		preparedStatement .execute();
	}
	
	public void findData(int id) throws SQLException{
		 DbConnection connection = DbConnection.getInstance();
			
		 Connection dbConnection = connection.getConnection();
		 //Employee user = new Employee();
		 
		 String findData = "SELECT Emp_Name, Emp_Salary, Emp_Country, Emp_City, Emp_ZipCode FROM [dbo].[EmployeeT_Tahrima] WHERE Emp_ID = ?";
		 PreparedStatement preparedStatement = dbConnection.prepareStatement(findData);
		 
		 preparedStatement.setInt(1, id);
		 preparedStatement .execute();
		 
		/* ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				user.setEmployee_Name(rs.getString("Emp_Name"));
				user.setEmployee_City(rs.getString("Emp_City"));
				user.setEmployee_ID(rs.getInt("Emp_ID"));
				user.setEmployee_Salary(rs.getInt("Emp_Salary"));
				user.setEmployee_Country(rs.getString("Emp_Country"));
				user.setEmployee_ZipCode(rs.getString("Emp_ZipCode"));

			}
			return user;*/
	}
	
	public void wildCardData(String match) throws SQLException{
		DbConnection connection = DbConnection.getInstance();
		
		 Connection dbConnection = connection.getConnection();
		 	 
		 String word = "%" + match + "%";
		 
		 String wildCardData = "SELECT Emp_Name FROM [dbo].[EmployeeT_Tahrima] WHERE Emp_Name LIKE ?";
		 PreparedStatement preparedStatement = dbConnection.prepareStatement(wildCardData);
		 
		 preparedStatement.setString(1, word);
		 preparedStatement .execute();
		
	}

}
