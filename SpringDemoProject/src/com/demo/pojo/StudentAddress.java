package com.demo.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class StudentAddress {
	
	private String flatNo;
	private String area;
	private String city;
	private String state;
	private long pincode;
	private String country;
	
	public StudentAddress() {
	}
	
	public StudentAddress(String flatNo) {
		this.flatNo=flatNo;
	}
	
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return " [flatNo=" + flatNo + ", area=" + area + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ", country=" + country + "]";
	}
	
}
