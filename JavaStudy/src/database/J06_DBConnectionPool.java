package database;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.dbpool.MyConncetionPool;
import database.dbpool.MyConnection;

public class J06_DBConnectionPool {
	
	/*
	 *  미리 커넥션 객체를 여러개 생성해두고 잠시 빌려주는 형태로 사용한다
	 *  매번 연결을 끊지 않고 프로그램이 종료될때 모든 연결을 
	 * 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		MyConncetionPool mypool = new MyConncetionPool(5);
		int i = 0;

		while (i++ < 15) {
			String sql = "SELECT * FROM employees";
			try (MyConnection conn = mypool.borrowConnection();
					PreparedStatement pstmt = conn.prepareStatement(sql);
					ResultSet rs = pstmt.executeQuery();) {
				while (rs.next()) {
					System.out.println(rs.getInt("employee_id"));
				}
				System.out.println(i + "회 출력");
				Thread.sleep(1000);

			} catch (IOException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
