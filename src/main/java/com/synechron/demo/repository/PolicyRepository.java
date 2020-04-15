package com.synechron.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synechron.demo.entity.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Integer> {

}
