package com.example.Uber.Backend.Reposetory;

import com.example.Uber.Backend.Model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverReposetory extends JpaRepository<Driver, Integer> {
}
