package Entities;

import Utilities.Address;


public abstract class Place {
	String name,discreption,telphone;
	Address address;
	
	public Place(String name, String discreption, String telphone, Address address) {
		this.name = name;
		this.discreption = discreption;
		this.telphone = telphone;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscreption() {
		return discreption;
	}
	public void setDiscreption(String discreption) {
		this.discreption = discreption;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
