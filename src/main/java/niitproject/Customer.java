package niitproject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Customer {
	
	
	
	private String cust_name;
	@Id
	private String cust_email;
	private String cust_city;
	private String cust_country;
	private String cust_complaint;
	private String cust_pwd;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String cust_name,String cust_email,String cust_city,String cust_country,String cust_complaint,String cust_pwd) {
		this.cust_name=cust_name;
		this.cust_email=cust_email;
		this.cust_city=cust_city;
		this.cust_country=cust_country;
		this.cust_complaint=cust_complaint;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_email() {
		return cust_email;
	}

	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	public String getCust_city() {
		return cust_city;
	}

	public void setCust_city(String cust_city) {
		this.cust_city = cust_city;
	}

	public String getCust_country() {
		return cust_country;
	}

	public void setCust_country(String cust_country) {
		this.cust_country = cust_country;
	}

	public String getCust_complaint() {
		return cust_complaint;
	}

	public void setCust_complaint(String cust_complaint) {
		this.cust_complaint = cust_complaint;
	}
	public String getCust_pwd() {
		return cust_pwd;
	}

	public void setCust_pwd(String cust_pwd) {
		this.cust_pwd = cust_pwd;
	}



	

}
