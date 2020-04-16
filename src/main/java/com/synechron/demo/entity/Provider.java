package com.synechron.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Provider {
	
	@Id
	private int providerID;
	private String providerName;
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="policyProviderID_ref")
	private List<Policy> policies;
	

	@Override
	public String toString() {
		return "Provider [providerID=" + providerID + ", providerName=" + providerName + ", policies=" + policies + "]";
	}
	


}
