
package com.zekeriyafince.javamernisdemo.entities;

import com.zekeriyafince.javamernisdemo.interfaces.Entity;
import java.util.Date;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.05.2021 17:15
 */
public class Customer implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private Date birthDate;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, String identityNumber, Date birthDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
