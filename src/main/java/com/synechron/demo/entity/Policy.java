package com.synechron.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Policy {
	
	@Id
	private int policyID;
	//private int policyProviderID;
	private String policyName;
	private String policyType;
	//private String policyDetails;
	private double policyAmountPerMonth;
	
	@Override
	public String toString() {
		return "Policy [policyID=" + policyID + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", policyAmountPerMonth=" + policyAmountPerMonth + "]";
	}

	
	
	
	

}
