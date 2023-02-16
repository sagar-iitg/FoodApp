package com.sk.controllers;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	
	
	
	public static Connection connection() throws ClassNotFoundException, SQLException {
		
		
		String url="jdbc:mysql://db:3306/";
		String userName="root";
		String password="root";
		//load Mysql
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		

		//get the connection
		
			Connection con=DriverManager.getConnection(url,userName,password);
		
		
			//create a statement
		
			Statement stmt=con.createStatement();
			String db_drop_sql = "Drop DATABASE IF EXISTS FOOD";
		    stmt.executeUpdate(db_drop_sql);
		    System.out.println("Database created successfully..."); 
		    
		    
			String db_create_sql = "CREATE DATABASE IF NOT EXISTS FOOD";
		    stmt.executeUpdate(db_create_sql);
		    System.out.println("Database created successfully..."); 
		    
		    String select_db_sql="use FOOD";
		    stmt.executeUpdate(select_db_sql);

		    String table_create_sql = "create table IF NOT EXISTS FOOD.foodcart(id int, itemName varchar(45), Price  float,PRIMARY KEY  (id))";
		    stmt.executeUpdate(table_create_sql);
		    System.out.println("Table created successfully..."); 
		    
		    
		    String insert_table="insert into FOOD.foodcart (id,itemName,Price) values(2, 'Veg Thali','500')";
		    stmt.executeUpdate(insert_table);
		    
		    String insert_table1="insert into foodcart (id,itemName,Price) values(1, 'Pizza','550')";
		    stmt.executeUpdate(insert_table1);
		    
		    return con;
		    
		    
		
	}
	
	//load Mysql
	

	
	
}