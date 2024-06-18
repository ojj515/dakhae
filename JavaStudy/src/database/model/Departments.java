package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Departments {
	private Integer department_id;
	private String department_name;
	private Integer manager_id;
	private Integer location_id;
	
	public Departments (ResultSet rs) throws SQLException {
		department_id = rs.getInt(1);
		department_name = rs.getString(2);
		manager_id = rs.getInt(3);
		location_id = rs.getInt(4);
	}

	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public Integer getManager_id() {
		return manager_id;
	}
	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}
	public Integer getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}

	@Override
	public String toString() {
		return "Departments [department_id=" + department_id + ", department_name=" + department_name + ", manager_id="
				+ manager_id + ", location_id=" + location_id + "]";
	}
	
	
}
