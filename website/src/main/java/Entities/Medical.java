package Entities;

import javax.persistence.Entity;

import Utilities.Address;

@Entity
public class Medical extends Place{

	public Medical(int iD, String name, String discreption, String telphone, String photoURL, Address address) {
		super(iD, name, discreption, telphone, photoURL, address);
		// TODO Auto-generated constructor stub
	}


}
