package com.javastuff.deloittestuff.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;

public class JDBCDemo {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "adithya", "adithya");
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM members");
			
			while(rs.next()){
				System.out.println(rs.getInt(1) + " # " + rs.getString(2));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(Objects.nonNull(rs)){
				try{
					rs.close();
				}catch (Exception e){
					
				}
			}
		}
	}
}
