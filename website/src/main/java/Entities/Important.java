package Entities;

import javax.persistence.Entity;
import Utilities.Address;

@Entity
public class Important extends Place{

	public Important(int iD, String name, String discreption, String telphone, String photoURL, Address address) {
		super(iD, name, discreption, telphone, photoURL, address);
		// TODO Auto-generated constructor stub
	}

}
