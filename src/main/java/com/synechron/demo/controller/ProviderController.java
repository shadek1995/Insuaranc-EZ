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

import com.synechron.demo.entity.Provider;
import com.synechron.demo.service.ProviderService;

@RestController
public class ProviderController {
	
	@Autowired
	private ProviderService providerService;
	
	@PostMapping("/addProvider")
	public Provider addProvider(@RequestBody Provider provider) {
		return providerService.saveProvider(provider);
	}

	@GetMapping("/providers")
	public List<Provider> findAllProviders(){
		return providerService.getProviders();
	}
	
	@GetMapping("/providerByID/{providerID}")
	public Provider findProviderByID(@PathVariable int providerID) {
		return providerService.getProviderByID(providerID);
	}
	
	@DeleteMapping("deleteByID/{providerID}")
	public String deleteProviderByID(@PathVariable int providerID) {
		return providerService.deleteProvider(providerID);
	}
	
	@PutMapping("updateProvider")
	public Provider updateProvider(@RequestBody Provider provider){
		return providerService.updateProvider(provider);
	}

}
