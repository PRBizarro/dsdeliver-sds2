package com.devsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.security.access.method.P;

import com.devsuperior.dsdeliver.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
