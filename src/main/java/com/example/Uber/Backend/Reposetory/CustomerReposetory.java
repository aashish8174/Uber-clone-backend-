package com.example.Uber.Backend.Reposetory;

import com.example.Uber.Backend.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReposetory extends JpaRepository<Customer, Integer> {
}
