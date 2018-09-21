package kr.co.jboard2.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConfig {

	private static final String HOST = "jdbc:mysql://192.168.0.23:3306/ksh";
	private static final String USER = "ksh";
	private static final String PASS = "1234";
	
	public static Connection getConnection() throws Exception{
		
		//1단계
				Class.forName("com.mysql.jdbc.Driver");
		//2단계 
				Connection conn = DriverManager.getConnection(HOST,USER,PASS);
				return conn;
	}
	public static void close(Connection conn) {
		
		try {
		conn.close();
	}catch(SQLException e) {
		e.printStackTrace();
		}
	}
	public static void close(PreparedStatement psmt) {
			
			try {
			psmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Statement stmt) {
			
			try {
			stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(ResultSet rs) {
		
		try {
		rs.close();
	}catch(SQLException e) {
		e.printStackTrace();
		}
	}	


}