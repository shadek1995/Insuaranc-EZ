package com.synechron.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table

public class Provider {
	
	@Id
	private int providerID;
	private String providerName;
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="policyProviderID_ref")
	private List<Policy> policies;
	
	
	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Provider(int providerID, String providerName, List<Policy> policies) {
		super();
		this.providerID = providerID;
		this.providerName = providerName;
		this.policies = policies;
	}


	public int getProviderID() {
		return providerID;
	}


	public void setProviderID(int providerID) {
		this.providerID = providerID;
	}


	public String getProviderName() {
		return providerName;
	}


	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}


	public List<Policy> getPolicies() {
		return policies;
	}


	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}


	@Override
	public String toString() {
		return "Provider [providerID=" + providerID + ", providerName=" + providerName + ", policies=" + policies + "]";
	}
	


}
