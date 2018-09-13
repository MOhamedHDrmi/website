package Utilities;

public class Address {
	private String governrate,city,details;

	public Address(String governrate, String city, String details) {
		super();
		this.governrate = governrate;
		this.city = city;
		this.details = details;
	}

	public String getGovernrate() {
		return governrate;
	}

	public void setGovernrate(String governrate) {
		this.governrate = governrate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
}
