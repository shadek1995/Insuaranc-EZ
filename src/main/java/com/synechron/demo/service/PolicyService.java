package com.synechron.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.synechron.demo.entity.Policy;
import com.synechron.demo.repository.PolicyRepository;


@Service
public class PolicyService {

	@Autowired
	private PolicyRepository policyRepository;
	
	public Policy savePolicy(Policy policy){
		return policyRepository.save(policy);
	}
	
	public List<Policy> savePolicies(List<Policy> policies){
		return policyRepository.saveAll(policies);
	}

	public List<Policy>	getPolicies(){
		return policyRepository.findAll();
	}
	
	public Policy getPolicyById(int policyID){
		return policyRepository.findById(policyID).orElse(null);
	}
	
	public String deletePolicy(int policyID){
		policyRepository.deleteById(policyID);
		return "Policy removed "+policyID;
	}
	
	public Policy updatePolicy(Policy policy){
		Policy existingPolicy=policyRepository.findById(policy.getPolicyID()).orElse(null);
		
		existingPolicy.setPolicyName(policy.getPolicyName());
		existingPolicy.setPolicyType(policy.getPolicyType());
		existingPolicy.setPolicyAmountPerMonth(policy.getPolicyAmountPerMonth());
		
		return policyRepository.save(existingPolicy);
	}
		
	
}
