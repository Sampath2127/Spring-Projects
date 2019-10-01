package com.lovecoding.springmvc.beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class CustomerDetails {

	@NotNull(message="mandatory field")
	@Size(min=1, message="mandatory Field")
	private String customerName;
	
	@Pattern(regexp="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message="Please enter valid email format")
	private String customerEmail;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="Please enter 5chars/digits")
	private String zipcode;
	
	@Pattern(regexp="^([\\(]{1}[0-9]{3}[\\)]{1}[\\-]{1}[0-9]{3}[\\-]{1}[0-9]{4})$", message="Please enter valid phone number in followinf format (xxx)-xxx-xxxx")
	private String phoneNumber;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
