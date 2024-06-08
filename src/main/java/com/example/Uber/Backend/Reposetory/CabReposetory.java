package com.example.Uber.Backend.Reposetory;

import com.example.Uber.Backend.Model.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabReposetory  extends JpaRepository<Cab, Integer> {
}
