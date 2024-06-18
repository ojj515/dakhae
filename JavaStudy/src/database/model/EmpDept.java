package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class EmpDept {
	
	Integer employee_id;
	String first_name;
	String last_name;
	String email;
	String phone_number;
	Date hire_date;
	String job_id;
	Double salary;
	Double commission_pct;
	Integer emp_manager_id;
	Integer department_id;
	String departmnet_name;
	Integer dept_manager_id;
	Integer location_id;

	public EmpDept() {}
	
	public EmpDept(ResultSet rs) throws SQLException {
		employee_id = rs.getInt("employee_id");
		first_name = rs.getString("first_name");
		email = rs.getString("email");
		phone_number = rs.getString("phone_number");
		hire_date = rs.getDate("hire_date");
		job_id = rs.getString("job_id");
		salary = rs.getDouble("salary");
		commission_pct = rs.getDouble("commission_pct");
		emp_manager_id = rs.getInt("emp_manager_id");
		department_id =  rs.getInt("department_id");
		departmnet_name = rs.getString("department_name");
		dept_manager_id = rs.getInt("dept_manager_id");
		location_id = rs.getInt("location_id");
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getCommission_pct() {
		return commission_pct;
	}

	public void setCommision_pct(Double commission_pct) {
		this.commission_pct = commission_pct;
	}

	public Integer getEmp_manager_id() {
		return emp_manager_id;
	}

	public void setEmp_manager_id(Integer emp_manager_id) {
		this.emp_manager_id = emp_manager_id;
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public String getDepartmnet_name() {
		return departmnet_name;
	}

	public void setDepartmnet_name(String departmnet_name) {
		this.departmnet_name = departmnet_name;
	}

	public Integer getDept_manager_id() {
		return dept_manager_id;
	}

	public void setDept_manager_id(Integer dept_manager_id) {
		this.dept_manager_id = dept_manager_id;
	}

	public Integer getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}

	@Override
	public String toString() {
		return "EmpDept [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", phone_number=" + phone_number + ", hire_date=" + hire_date + ", job_id="
				+ job_id + ", salary=" + salary + ", commision_pct=" + commission_pct + ", emp_manager_id="
				+ emp_manager_id + ", department_id=" + department_id + ", departmnet_name=" + departmnet_name
				+ ", dept_manager_id=" + dept_manager_id + ", location_id=" + location_id + "]";
	}
	
	
}
