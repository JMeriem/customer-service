package org.example.customerservice.Dao.repository;

import org.example.customerservice.Dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface CustomerRepository extends JpaRepository<Customer, Long> {

    }
