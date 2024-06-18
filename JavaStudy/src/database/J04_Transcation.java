package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J04_Transcation {

	public static void main(String[] args) {
		DBConnector connector = new DBConnector("HR", "1234");
		
		// 기본적으로 자바에서 생성한 연결은 오토 커밋이 활성화 되어있어서
		// 직접 트랜잭션을 제어할 수 없다
		try (
			Connection conn = connector.getConnection();
		) {
			// 트랜젝션을 직적 제어하기 위해 오토커밋을 비활성화
			conn.setAutoCommit(false);
			
			// 0. 오늘의 매출이 조회가 되지 않는 상태라면 새로운 행을 생성한다
			
			// 1. 판매가 발생하면 매출액이 증가한다
			String sql1 = "SELECT COUNT(*) FROM sales WHERE "
					+ "sale_date = TO_CHAR(sysdate, 'YY/MM/DD')";
			
			boolean saleAdyExists = false;
			try (
				PreparedStatement pstmt = conn.prepareStatement(sql1);
				ResultSet rs = pstmt.executeQuery();
			) {
				rs.next();
				saleAdyExists = rs.getInt(1) > 0;
				
				if(saleAdyExists) {
					System.out.println("오늘의 매출 내역이 이미 존재합니다");
				} else {
					System.out.println("아직 매출 내역이 없어서 행을 추가합니다");
				}
				
 			}
			
			String insert = "INSERT INTO sales(sale_date, sales) "
					+ "VALUES(TO_CHAR(sysdate, 'YY/MM/DD'), ?)";
			String update = "UPDATE sales SET purchase = sales + ? "
					+ "WHERE sale_date = TO_CHAR(sysdate, 'YY/MM/DD')";
			// 2. 해당 과일의 재고를 감소시킨다
			try (
				PreparedStatement pstmt = conn.prepareStatement(saleAdyExists ? update : insert);	
			) {
				pstmt.setInt(1, 5000);
				int row = pstmt.executeUpdate();
				System.out.printf("%d행 변경되었습니다\n", row);
			} catch (SQLException e) {
				e.printStackTrace(); // 스택 찍어주고
				conn.rollback(); // DB 롤백하고
				return; // 메서드 강제종료
			}
			
			// 2. 해당 과일의 재고를 감소시킨다
			String reduceQty = "UPDATE fruits SET qty = qty - ? WHERE fname = ?";
			
			try (
				PreparedStatement pstmt = conn.prepareStatement(reduceQty);
			) {
				pstmt.setInt(1, 1); // 감소할 개수 설정
				pstmt.setString(2, "사과"); // 과일 이름 설정
				
				int row = pstmt.executeUpdate();
				System.out.printf("%d행 변경되었습니다\n", row);
			} catch (SQLException e) {
				e.printStackTrace();
				conn.rollback();
				return;
			}
			// 자동 커밋이 꺼져있기 때문에
			// 제대로 모두 수행한다면 수동으로 커밋 해줘야 한다
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

