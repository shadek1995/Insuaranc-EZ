package com.synechron.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.synechron.demo.entity.Policy;
import com.synechron.demo.service.PolicyService;

@RestController
public class PolicyController {
	
	@Autowired
	private PolicyService policyService;
	
	@PostMapping("/addPolicy")
	public Policy addPolicy(@RequestBody Policy policy) {
		return policyService.savePolicy(policy);
	}
	
	@PostMapping("/addPolicies")
	public List<Policy> addPolicies(@RequestBody List<Policy> policies) {
		return policyService.savePolicies(policies);
	}
	
	
	@GetMapping("/policies")
	public List<Policy> findAllPolocies(){
		return policyService.getPolicies();
	}
	
	
	@GetMapping("policy/{policyID}")
	public Policy findPolicyByID(@PathVariable int policyID) {
		return 	policyService.getPolicyById(policyID);
	}
	
	
	@DeleteMapping("/delete/{policyID}")
	public String deletePolicy(@PathVariable int policyID) {
		return policyService.deletePolicy(policyID);
	}
	
	
	@PutMapping("/updatePolicy")
	public Policy updatePolicy(@RequestBody Policy policy) {
		return policyService.updatePolicy(policy);
	}
	 
	

}
