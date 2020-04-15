package com.synechron.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechron.demo.entity.Policy;
import com.synechron.demo.entity.Provider;
import com.synechron.demo.repository.ProviderRepository;

@Service
public class ProviderService {
	
	@Autowired
	private ProviderRepository providerRepository;
	
	@Autowired
	private PolicyService policyService;

	public Provider saveProvider(Provider provider) {
		List<Policy> policies=provider.getPolicies();
		policyService.savePolicies(policies);
		return providerRepository.save(provider);		
	}
	
	public List<Provider> getProviders(){
		return providerRepository.findAll();
	}
	
	public Provider getProviderByID(int providerID) {
		return providerRepository.findById(providerID).orElse(null);
	}
	
	public String deleteProvider(int providerID) {
		providerRepository.deleteById(providerID);
		return "Deleted "+providerID+" successfully";
	}
	
	public Provider updateProvider(Provider provider) {
		Provider existingProvider=providerRepository.findById(provider.getProviderID()).orElse(null);
		
		existingProvider.setProviderName(provider.getProviderName());
		
		return providerRepository.save(existingProvider);
	}
	
}
