package database.dbpool;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class MyConncetionPool {
	List <MyConnection> pool = new ArrayList<>();
	
	public MyConncetionPool(int size) {
		for(int i = 0; i < size; ++i) {
			pool.add(new MyConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE", "HR", "1234"));
		}
	}
	
	public MyConnection borrowConnection() {
		while (true) {
			for (MyConnection conn : pool) {
				if (!conn.using) {
					conn.use();
					return conn;
				}
			}
			System.out.println("모든 커넥션이 사용중...");
			
		}
	}

}


