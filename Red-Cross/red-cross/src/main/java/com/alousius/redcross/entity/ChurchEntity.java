package com.alousius.redcross.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class ChurchEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String churchName;
	
	private Double lattitude;
	
	private Double longitude;
	
	private String streetName;
	
	private String cityName;
	
	private String state;
	
	private String country;
	
	private Long pincode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChurchName() {
		return churchName;
	}

	public void setChurchName(String churchName) {
		this.churchName = churchName;
	}

	public Double getLattitude() {
		return lattitude;
	}

	public void setLattitude(Double lattitude) {
		this.lattitude = lattitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "ChurchEntity [id=" + id + ", churchName=" + churchName + ", lattitude=" + lattitude + ", longitude="
				+ longitude + ", streetName=" + streetName + ", cityName=" + cityName + ", state=" + state
				+ ", country=" + country + ", pincode=" + pincode + "]";
	}

	

}
