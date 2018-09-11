package Entities;

import javax.persistence.Entity;

import Utilities.Address;

@Entity
public class Medical extends Place{

	public Medical(String name, String discreption, String telphone, Address address) {
		super(name, discreption, telphone, address);
	}
}
