package com.hdd.hdsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdd.hdsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}