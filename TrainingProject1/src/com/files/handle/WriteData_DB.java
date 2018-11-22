package com.files.handle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteData_DB {

	public static void main(String[] args) throws SQLException {

		String sqldb_url = "jdbc:mysql://localhost:3307/company";
		// Use your database username here. It Is "root" for root account.
		String sqldb_uname = "root";
		String sqldb_pass = "admin";
		// To Create database connection.
		Connection db = DriverManager.getConnection(sqldb_url, sqldb_uname, sqldb_pass);
		Statement st = db.createStatement();
		
		st.execute("INSERT INTO emp (id, name, age, sal) VALUES (26, 'aaa', 25,3435435);");
		
		db.close();
	}

}
