package com.Dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Dao {

	public void Insert() throws Exception {
		System.out.println("enter your id no : ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		System.out.println("enter your Name : ");
		String name = sc.next();

		System.out.println("enter your Email id : ");
		String email = sc.next();

		System.out.println("enter your password : ");
		String password = sc.next();

		System.out.println("enter your gender : ");
		String gender = sc.next();

		System.out.println("enter your city : ");
		String city = sc.next();

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded succesfully");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		System.out.println("connect with databse succesfully..");
		PreparedStatement ps = c.prepareStatement("insert into regester values (?,?,?,?,?,?)");
		ps.setLong(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, password);
		ps.setString(5, gender);
		ps.setString(6, city);

		int r = ps.executeUpdate();

		if (r > 0) {
			System.out.println("data succesfully inserted...");
		} else {
			System.out.println("data are no inserted...");
		}

	}

	public void Update() throws Exception {
		System.out.println("enter your id no : ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		System.out.println("enter your Name : ");
		String name = sc.next();

		System.out.println("enter your Email id : ");
		String email = sc.next();

		System.out.println("enter your password : ");
		String password = sc.next();

		System.out.println("enter your gender : ");
		String gender = sc.next();

		System.out.println("enter your city : ");
		String city = sc.next();

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded succesfully");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		System.out.println("connect with databse succesfully..");
		PreparedStatement ps = c
				.prepareStatement("update regester set name=?,email=?,password=?,gender=?,city=? where id=?");
		ps.setLong(6, id);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, gender);
		ps.setString(5, city);

		int r = ps.executeUpdate();

		if (r > 0) {
			System.out.println("data succesfully Updated...");
		} else {
			System.out.println("data are no Updated...");
		}

	}

	public void Delete() throws Exception {

		System.out.println("enter your id no : ");

		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded succesfully");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		System.out.println("connect with databse succesfully..");

		PreparedStatement ps = c.prepareStatement("delete from regester where id = ? ");
		ps.setLong(1, id);

		int i = ps.executeUpdate();

		if (i > 0) {
			System.out.println("data successfully deleted..");
		} else {
			System.out.println(" delete operation is failed.... ");
		}

	}

	public void Select() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded succesfully");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		System.out.println("connect with databse succesfully..");
		System.out.println(" regester table ");
		Statement s = c.createStatement();

		ResultSet r = s.executeQuery("select * from regester ");
		while (r.next()) {
			System.out.println(r.getInt(1) + "     " + r.getString(2) + "     " + r.getString(3) + "     "
					+ r.getString(4) + "     " + r.getString(5) + "     " + r.getString(6));

		}
	}

	
}
