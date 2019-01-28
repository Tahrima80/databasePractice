package com.database.Util;
import lombok.extern.java.Log;
import lombok.extern.slf4j.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@Slf4j

public class DbConnection {
	
	private static Connection connection;
	private static DbConnection instance = null;
	
	private DbConnection() {
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
					+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
			log.info("connection created.");
			// conn.close();
		} catch (Exception e) {
			log.error("Connection error: " + e.getMessage());
		}
	}
	
	public static DbConnection getInstance() {
		if (instance == null) {
			instance = new DbConnection();
			return instance;
		} else {
			return instance;
		}

	}
	
	public Connection getConnection() {
		return connection;

	}
	
	public static void closeAll(ResultSet rs, PreparedStatement stmt, Connection conn) {
		if (rs != null) {
			try {
				rs.close();

			} catch (SQLException e) {
				log.error("The result set cannot be closed.", e);
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				log.error("The statement cannot be closed.", e);
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				log.error("The data source connection cannot be closed.", e);
			}
		}
	}
	
	public static void main(String[] args) {
		
		new DbConnection();
		System.out.println("successfull");
	}

}
