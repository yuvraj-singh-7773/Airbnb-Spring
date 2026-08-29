package com.example.AirbnbBookingSpring.repositories.writes;

import com.example.AirbnbBookingSpring.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingWriteRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByAirbnbId(String airbnbId);
}
