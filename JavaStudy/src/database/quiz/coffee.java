package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnector;
import database.model.Coffee;

public class coffee {
	
	private static DBConnector connector = new DBConnector("HR", "1234");
	
	public static List getCoffeeyBycoffname(String coffeename) {
		List <Coffee> list = new ArrayList<>();
		
		String sql = "SELECT * FROM coffee WHERE coffee_name = ?";
		
		try (
			Connection conn = connector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setString(1, coffeename);
			
			try ( 
				ResultSet rs = pstmt.executeQuery();
		) {
				while(rs.next()) {
					Coffee coffee = new Coffee(rs);
					list.add(coffee);
					System.out.println(rs.getInt("coffee_id"));
				}
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		getCoffeeyBycoffname("아메리카노");
	}
	
}
