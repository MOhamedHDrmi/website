package Entities;

import Utilities.Address;


public abstract class Place {
	int ID;
	String name,discreption,telphone,photoURL;
	Address address;
	

	public Place(int iD, String name, String discreption, String telphone, String photoURL, Address address) {
		ID = iD;
		this.name = name;
		this.discreption = discreption;
		this.telphone = telphone;
		this.photoURL = photoURL;
		this.address = address;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
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
