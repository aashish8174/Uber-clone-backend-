package com.example.Uber.Backend.Reposetory;

import com.example.Uber.Backend.Model.TripBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripBookingReposetory extends JpaRepository<TripBooking, Integer> {
}
