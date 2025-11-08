package com.ecom.model;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserDtls {

    @NotBlank(message = "Full name is required.")
    @Pattern(regexp = "^[a-zA-Z\s]+$", message = "Full name must only contain alphabets and spaces.")
    private String name;

    @NotBlank(message = "Mobile number is required.")
    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be 10 digits.")
    private String mobileNumber;

    @NotBlank(message = "Email is required.")
    @Email(message = "Please provide a valid email address.")
    private String email;

    @NotBlank(message = "Address is required.")
    private String address;

    @NotBlank(message = "City is required.")
    private String city;

    @NotBlank(message = "State is required.")
    private String state;

    @NotBlank(message = "Pincode is required.")
    @Pattern(regexp = "^[0-9]{6}$", message = "Pincode must be 6 digits.")
    private String pincode;

    @NotBlank(message = "Password is required.")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$",
             message = "Password must include uppercase, lowercase, digit, and special character.")
    private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    
}