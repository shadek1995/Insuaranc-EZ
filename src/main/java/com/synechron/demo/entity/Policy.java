package com.synechron.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Policy {
	
	@Id
	private int policyID;
	//private int policyProviderID;
	private String policyName;
	private String policyType;
	//private String policyDetails;
	private double policyAmountPerMonth;
	
	public Policy() {
		super();
	}

	public Policy(int policyID, String policyName, String policyType, double policyAmountPerMonth) {
		super();
		this.policyID = policyID;
		this.policyName = policyName;
		this.policyType = policyType;
		this.policyAmountPerMonth = policyAmountPerMonth;
	}

	public int getPolicyID() {
		return policyID;
	}

	public void setPolicyID(int policyID) {
		this.policyID = policyID;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public double getPolicyAmountPerMonth() {
		return policyAmountPerMonth;
	}

	public void setPolicyAmountPerMonth(double policyAmountPerMonth) {
		this.policyAmountPerMonth = policyAmountPerMonth;
	}

	@Override
	public String toString() {
		return "Policy [policyID=" + policyID + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", policyAmountPerMonth=" + policyAmountPerMonth + "]";
	}

	
	
	
	

}
