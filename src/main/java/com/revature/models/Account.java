package com.revature.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.GeneratedValue;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table
@TableGenerator(name="accid",initialValue=2000,allocationSize=50)
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountid;
	private double balance;
	private AccType type;
	private AccStatus status;
	private String approvedby;
	private String createdon;
	
	@OneToOne(mappedBy="userid",fetch=FetchType.LAZY)
	private User owner;
	
	public Account() {
		super();
	}
	
	public Account(double balance, AccType type, AccStatus status, User owner) {
		super();
		this.balance = balance;
		this.type = type;
		this.status = status;
		this.owner = owner;
	}



	public Account(double balance, AccType type, AccStatus status, String approvedby, String createdon, User owner) {
		super();
		this.balance = balance;
		this.type = type;
		this.status = status;
		this.approvedby = approvedby;
		this.createdon = createdon;
		this.owner = owner;
	}

	public Account(int accountid, double balance, AccType type, AccStatus status, String approvedby, String createdon,
			User owner) {
		super();
		this.accountid = accountid;
		this.balance = balance;
		this.type = type;
		this.status = status;
		this.approvedby = approvedby;
		this.createdon = createdon;
		this.owner = owner;
	}

	public int getAccountid() {
		return accountid;
	}

	public double getBalance() {
		return balance;
	}

	public AccType getType() {
		return type;
	}

	public AccStatus getStatus() {
		return status;
	}

	public String getApprovedby() {
		return approvedby;
	}

	public String getCreatedon() {
		return createdon;
	}

	public User getOwner() {
		return owner;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setType(AccType type) {
		this.type = type;
	}

	public void setStatus(AccStatus status) {
		this.status = status;
	}

	public void setApprovedby(String approvedby) {
		this.approvedby = approvedby;
	}

	public void setCreatedon(String createdon) {
		this.createdon = createdon;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountid;
		result = prime * result + ((approvedby == null) ? 0 : approvedby.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((createdon == null) ? 0 : createdon.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Account other = (Account) obj;
		if (accountid != other.accountid)
			return false;
		if (approvedby == null) {
			if (other.approvedby != null)
				return false;
		} else if (!approvedby.equals(other.approvedby))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (createdon == null) {
			if (other.createdon != null)
				return false;
		} else if (!createdon.equals(other.createdon))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (status != other.status)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", balance=" + balance + ", type=" + type + ", status=" + status
				+ ", approvedby=" + approvedby + ", createdon=" + createdon + ", owner=" + owner + "]";
	}
	
	
	
}
