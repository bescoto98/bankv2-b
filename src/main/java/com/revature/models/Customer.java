package com.revature.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.GenerationType;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table
@TableGenerator(name="custid",initialValue=5000,allocationSize=50)
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerid;
	
	@OneToOne(mappedBy="userid",fetch=FetchType.LAZY)
	private User person;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private List<Account> accounts;

	public Customer() {
		super();
	}

	public Customer(User person, List<Account> accounts) {
		super();
		this.person = person;
		this.accounts = accounts;
	}

	public Customer(int customerid, User person, List<Account> accounts) {
		super();
		this.customerid = customerid;
		this.person = person;
		this.accounts = accounts;
	}

	public int getCustomerid() {
		return customerid;
	}

	public User getPerson() {
		return person;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public void setPerson(User person) {
		this.person = person;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + customerid;
		result = prime * result + ((person == null) ? 0 : person.hashCode());
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
		Customer other = (Customer) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (customerid != other.customerid)
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", person=" + person + ", accounts=" + accounts + "]";
	}
	
}
