package com.synechron.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synechron.demo.entity.Provider;

public interface ProviderRepository extends JpaRepository<Provider, Integer> {

}
