package com.sk.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDBUtil {

	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException
	{
		
		
	
		
		
		
		ArrayList<Food> food=new ArrayList<>();
		
		
	
		Statement stmt=DBConnection.connection().createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from FOOD.foodcart");
		
		
		while(rs.next())
		{
			
			int id=rs.getInt(1);
			String item=rs.getString(2);
			float price=rs.getFloat(3);
			
			Food f=new Food(id,item,price);
			food.add(f);
				
		}
		
		return food;
		
	}
	

	

}
