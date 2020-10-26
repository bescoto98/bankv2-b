package com.revature.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Component
@Table
@TableGenerator(name="inid",initialValue=100,allocationSize=50)
public class Information {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int infoid;
	
	@Column(unique=true)
	private String ssn;
	
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	
	@Column(unique=true)
	private String email;
	
	@OneToOne(mappedBy="userid",fetch=FetchType.LAZY)
	private User owner;

	public Information() {
		super();
	}

	public Information(String ssn, String address, String city, String state, String zip, String phone, String email,
			User owner) {
		super();
		this.ssn = ssn;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
		this.owner = owner;
	}

	public Information(int infoid, String ssn, String address, String city, String state, String zip, String phone,
			String email, User owner) {
		super();
		this.infoid = infoid;
		this.ssn = ssn;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
		this.owner = owner;
	}

	public int getInfoid() {
		return infoid;
	}

	public String getSsn() {
		return ssn;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public User getOwner() {
		return owner;
	}

	public void setInfoid(int infoid) {
		this.infoid = infoid;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + infoid;
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Information other = (Information) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (infoid != other.infoid)
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}


	
		@Override
	public String toString() {
		return "Information [infoid=" + infoid + ", ssn=" + ssn + ", address=" + address + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", phone=" + phone + ", email=" + email + ", owner=" + owner + "]";
	}

}
