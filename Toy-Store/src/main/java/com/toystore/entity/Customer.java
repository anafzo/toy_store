package com.toystore.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="customer")
public class Customer {
	public static final int FIRST_NAME_MAX_LENGTH = 150;
	public static final int LASTNAME_MAX_LENGTH = 150;
	public static final int AVATAR_MAX_LENGTH = 150;
	public static final int EMAIL_MAX_LENGTH = 150;
	public static final int PASSWORD_MAX_LENGTH = 150;
	public static final int ADDRESS_MAX_LENGTH = 200;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private Long customerId;
	@Column(name="first_name", length=FIRST_NAME_MAX_LENGTH)
	private String firstName;
	@Column(name="last_name", length=LASTNAME_MAX_LENGTH)
	private String lastName;
	@Column(name="avatar", length=AVATAR_MAX_LENGTH)
	private String avatar;
	@NotNull 
	@Column(name="email", updatable=false, length=EMAIL_MAX_LENGTH)	
	private String email;
	@NotNull 
	@Column(name="password", updatable=false, length=PASSWORD_MAX_LENGTH)	
	private String password;
	@Column(name="address", length=ADDRESS_MAX_LENGTH)
	private String address;
	@Column(name="is_active")
	private Boolean isActive;
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
}
