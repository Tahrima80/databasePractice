package com.database.Service;

import java.sql.SQLException;
import java.util.List;

import com.database.DAO.EmployeeDao;
import com.database.Model.Employee;
import com.database.Util.DbOperation;

public class DbImplement implements EmployeeDao {

	@Override
	public boolean addUser(Employee user) {
		// TODO Auto-generated method stub
		
		DbOperation dbOperation = new DbOperation();
		try {
			dbOperation.addData(user);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean upadateUser(Employee user) {
		// TODO Auto-generated method stub
		DbOperation dbOperation = new DbOperation();
		
		try {
			dbOperation.updateData(user);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteUser(Employee user) {
		// TODO Auto-generated method stub
        DbOperation dbOperation = new DbOperation();
		
		try {
			dbOperation.deleteData(user);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Employee getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean findUserById(int id) {
		// TODO Auto-generated method stub
		
      DbOperation dbOperation = new DbOperation();
      //Employee user = new Employee();
		
		try {
			dbOperation.findData(id);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return true;
		
	}
	
	@Override
	public boolean nameMatch(String s) {
		// TODO Auto-generated method stub
		 DbOperation dbOperation = new DbOperation();
		 try {
				dbOperation.wildCardData(s);
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return true;
	}

}
