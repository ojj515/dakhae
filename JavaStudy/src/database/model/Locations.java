package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Locations {
	private Integer location_id;
	private String street_address;
	private Integer postal_code;
	private String city;
	private String state_province;
	private String country_id;
	
	public Locations (ResultSet rs) throws SQLException {
		location_id = rs.getInt(1);
		street_address = rs.getString(2);
		postal_code = rs.getInt(3);
		city = rs.getString(4);
		state_province = rs.getString(5);
		country_id = rs.getString(6);
	}

	public Integer getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}
	public String getStreet_address() {
		return street_address;
	}
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}
	public Integer getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(Integer postal_code) {
		this.postal_code = postal_code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState_province() {
		return state_province;
	}
	public void setState_province(String state_province) {
		this.state_province = state_province;
	}
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	@Override
	public String toString() {
		return "Locations [location_id=" + location_id + ", street_address=" + street_address + ", postal_code="
				+ postal_code + ", city=" + city + ", state_province=" + state_province + ", country_id=" + country_id
				+ "]";
	}
	
}
