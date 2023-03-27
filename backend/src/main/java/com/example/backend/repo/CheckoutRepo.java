package com.example.backend.repo;

import com.example.backend.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface CheckoutRepo extends JpaRepository<Checkout,Integer> {
}
