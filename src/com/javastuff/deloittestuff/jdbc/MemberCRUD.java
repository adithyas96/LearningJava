package com.javastuff.deloittestuff.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;


public class MemberCRUD {
	private static Connection con;
	private static BufferedReader input;

	public static void main(String[] args) {
		try {
			input = new BufferedReader(new InputStreamReader(System.in));
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "adithya", "adithya");

			String option = "";

			while (true) {
				printMenu();
				option = input.readLine();

				switch (option) {
				case "1":
					viewMembers();
					break;
				case "2":
					addMember();
					break;
				case "3":
					updateMember();
					break;
				case "4":
					deleteMember();
					break;
				case "5":
					return;
				default:
					System.out.println("Invalid Input, please try again");
					input.readLine();
				}

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(con)) {
				try {
					con.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public static void printMenu() {
		System.out.println();
		System.out.println("######## Operations Menu ########");
		System.out.println("1. View\n2. Add\n3. Update\n4. Delete\n5. Exit");
		System.out.print("Your Option: ");
	}

	
	public static void addMember() {
		Statement st = null;
		PreparedStatement pst = null;
		try {
			System.out.println("#########  NEW MEMBER DETAILS ########");

			System.out.print("Name: ");
			String name = input.readLine();

			System.out.print("Email: ");
			String email = input.readLine();
			
			pst = con.prepareStatement("INSERT INTO members VALUES(member_sequence.nextval, ?, ?)");
			pst.setString(1,name);
			pst.setString(2,email);
			//st = con.createStatement();
			//st.executeUpdate("INSERT INTO members VALUES(members_sequence.nextval, '" + name + "', '" + email + "')");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public static void viewMembers() {
		Statement st = null;
		ResultSet rs = null;

		try {
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM members");
			
			for(int i=0;i<66;i++){
				System.out.print('#');
			}
			System.out.println();
			while (rs.next()) {
				//System.out.println(rs.getInt(1) + " # " + rs.getString(2) + " # " + rs.getString(3));
			
				System.out.format("# %6d # %-20s # %-30s #%n", rs.getInt(1),rs.getString(2),rs.getString(3));
			}
			for(int i=0;i<66;i++){
				System.out.print('#');
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(rs)) {
				try {
					rs.close();
				} catch (Exception e) {

				}
			}
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public static void updateMember() {
		Statement st = null;
		ResultSet rs = null;

		try {

			st = con.createStatement();

			System.out.println("#########  UPDATE MEMBER DETAILS ########");
			System.out.print("Enter member id to update: ");
			int mem_id = Integer.parseInt(input.readLine());

			rs = st.executeQuery("SELECT * FROM members WHERE mem_id =" + mem_id);

			String oldName = "";
			String oldEmail = "";
			if (rs.next()) {
				oldName = rs.getString(2);
				oldEmail = rs.getString(3);
			}

			System.out.println("Old Name: " + oldName);
			System.out.print("Enter New Name: ");
			String name = input.readLine();

			System.out.println("Old Email: " + oldEmail);
			System.out.print("Enter New Email: ");
			String email = input.readLine();

			if (Objects.isNull(name) || name.trim().length() < 2) {
				name = oldName;
			}
			if (Objects.isNull(email) || email.trim().length() < 10) {
				email = oldEmail;
			}

			st.executeUpdate("UPDATE members SET name = '" + name + "', email = '" + email + "' WHERE " + "mem_id="
					+ mem_id);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public static void deleteMember() {
		Statement st = null;

		try {
			System.out.print("Member id for deletion: ");
			int mem_id = Integer.parseInt(input.readLine());

			st = con.createStatement();
			st.executeUpdate("DELETE FROM members WHERE mem_id=" + mem_id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(st)) {
				try {
					st.close();
				} catch (Exception e) {

				}
			}
		}
	}

}
